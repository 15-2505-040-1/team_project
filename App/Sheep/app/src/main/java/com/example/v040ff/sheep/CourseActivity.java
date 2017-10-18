package com.example.v040ff.sheep;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class CourseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);
    }
    public void onJhButtonTapped(View view){
        Intent intent=new Intent(this, LevelActivity.class);
        startActivity(intent);
    }
    public void onHsButtonTapped(View view){
        Intent intent=new Intent(this, Level2Activity.class);
        startActivity(intent);
    }
}
