package com.example.v040ff.sheep;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onStartButtonTapped(View view){
        Intent intent=new Intent(this, CourseActivity.class);
        startActivity(intent);
    }
    public void onMondaiButtonTapped(View view){
        Intent intent=new Intent(this, MondaiActivity.class);
        startActivity(intent);
    }

}
