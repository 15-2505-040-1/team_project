package com.example.v040ff.sheep;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Prob3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prob3);
    }
    public void onAns1ButtonTapped(View view) {
        Intent intent = new Intent(this, BatuActivity.class);
        startActivity(intent);
    }
    public void onAns2ButtonTapped(View view) {
        Intent intent = new Intent(this, seikai.class);
        startActivity(intent);
    }
    public void onAns3ButtonTapped(View view) {
        Intent intent = new Intent(this, BatuActivity.class);
        startActivity(intent);
    }
    public void onAns4ButtonTapped(View view) {
        Intent intent = new Intent(this, BatuActivity.class);
        startActivity(intent);
    }
}
