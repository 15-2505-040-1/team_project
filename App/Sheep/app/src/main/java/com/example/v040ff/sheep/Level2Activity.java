package com.example.v040ff.sheep;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Level2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2);
    }
    public void onLevel1ButtonTapped(View view){
        Intent intent=new Intent(this, Prob4Activity.class);
        startActivity(intent);
    }
    public void onLevel2ButtonTapped(View view){
        Intent intent=new Intent(this, Prob5Activity.class);
        startActivity(intent);
    }
    public void onLevel3ButtonTapped(View view){
        Intent intent=new Intent(this, Prob6Activity.class);
        startActivity(intent);
    }
}
