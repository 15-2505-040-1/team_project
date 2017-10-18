package com.example.v040ff.sheep;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import io.realm.Realm;
import io.realm.RealmResults;

public class SheepEditActivity extends AppCompatActivity {
    private Realm mRealm;
    EditText mNumEdit;
    EditText mMondaiEdit;
  //  EditText mKaisetsuEdit;
    Button mDelete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sheep_edit);
        mRealm = Realm.getDefaultInstance();
        mNumEdit = (EditText) findViewById(R.id.numEdit);
        mMondaiEdit = (EditText) findViewById(R.id.mondaiEdit);
     //   mKaisetsuEdit = (EditText) findViewById(R.id.kaisetsuEdit);
        mDelete=(Button)findViewById(R.id.delete);

        long sheepId = getIntent().getLongExtra("sheep_id", -1);
        if (sheepId != -1) {
            RealmResults<Sheep> results = mRealm.where(Sheep.class).equalTo("id", sheepId).findAll();
            Sheep sheep = results.first();
            mNumEdit.setText(sheep.getNum());
            mMondaiEdit.setText(sheep.getMondai());
           // mKaisetsuEdit.setText(sheep.getKaisetsu());
            mDelete.setVisibility(View.VISIBLE);
        }
        else{
            mDelete.setVisibility(View.INVISIBLE);
        }
    }

    public void onSaveButtonTapped(View view) {
        long sheepId = getIntent().getLongExtra("sheep_id", -1);
        if (sheepId != -1) {
            final RealmResults<Sheep> results = mRealm.where(Sheep.class).equalTo("id", sheepId).findAll();
            mRealm.executeTransaction(new Realm.Transaction() {
                @Override
                public void execute(Realm realm) {
                    Sheep sheep = results.first();
                    sheep.setNum(mNumEdit.getText().toString());
                    sheep.setMondai(mMondaiEdit.getText().toString());
                    //sheep.setKaisetsu(mKaisetsuEdit.getText().toString());
                }
            });
            Snackbar.make(findViewById(android.R.id.content), "更新完了", Snackbar.LENGTH_LONG).setAction("戻る", new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    finish();
                }
            }).setActionTextColor(Color.YELLOW).show();

        } else {
            mRealm.executeTransaction(new Realm.Transaction() {
                @Override
                public void execute(Realm realm) {
                    Number maxId = realm.where(Sheep.class).max("id");
                    long nextId = 0;
                    if (maxId != null) nextId = maxId.longValue() + 1;
                    Sheep sheep = realm.createObject(Sheep.class, new Long(nextId));
                    sheep.setNum(mNumEdit.getText().toString());
                    sheep.setMondai(mMondaiEdit.getText().toString());
                   // sheep.setKaisetsu(mKaisetsuEdit.getText().toString());
                }
            });
            finish();
        }
    }
    public void onDeleteTapped(View view){
        final long sheepId=getIntent().getLongExtra("sheep_id",-1);
        if(sheepId!=-1){
            mRealm.executeTransaction(new Realm.Transaction(){
                @Override
                public void execute(Realm realm){
                    Sheep sheep=realm.where(Sheep.class).equalTo("id",sheepId).findFirst();
                    sheep.deleteFromRealm();
                }
            });
        }
    }
}
