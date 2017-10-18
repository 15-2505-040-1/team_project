package com.example.v040ff.sheep;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class LevelActivity extends AppCompatActivity {
    int x=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);
    }
    public void onLevel1ButtonTapped(View view){
        Intent intent=new Intent(this, ProbActivity.class);
        startActivity(intent);
    }
    public void onLevel2ButtonTapped(View view){
        Intent intent=new Intent(this, Prob2Activity.class);
        startActivity(intent);
    }
    public void onLevel3ButtonTapped(View view){
        Intent intent=new Intent(this, Prob3Activity.class);
        startActivity(intent);
    }
}
