package com.example.v040ff.sheep;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import io.realm.Realm;
import io.realm.RealmResults;

public class MondaiActivity extends AppCompatActivity {
    private Realm mRealm;
    private ListView mListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mondai);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        mRealm = Realm.getDefaultInstance();

        mListView = (ListView) findViewById(R.id.listView);
        RealmResults<Sheep> sheeps = mRealm.where(Sheep.class).findAll();
        SheepAdapter adapter = new SheepAdapter(sheeps);
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Sheep sheep = (Sheep) parent.getItemAtPosition(position);
                        startActivity(new Intent(MondaiActivity.this, SheepEditActivity.class).putExtra("sheep_id", sheep.getId()));
                    }
                }
        );
    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        mRealm.close();
    }
    public void onAddButtonTapped(View view){
        Intent intent=new Intent(this, SheepEditActivity.class);
        startActivity(intent);
    }

}
