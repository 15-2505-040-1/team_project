package com.example.v040ff.sheep;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class KaisetsuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kaisetsu);
    }
    public void onReturnButtonTapped(View view) {
        finish();
    }
}
