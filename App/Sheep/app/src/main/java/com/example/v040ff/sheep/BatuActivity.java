package com.example.v040ff.sheep;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class BatuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_batu);
    }
    public void onKaisetuButtonTapped(View view) {
        Intent intent = new Intent(this, KaisetsuActivity.class);
        startActivity(intent);
    }
    public void onNextButtonTapped(View view) {
        Intent intent = new Intent(this, ProbActivity.class);
        startActivity(intent);
    }
}
