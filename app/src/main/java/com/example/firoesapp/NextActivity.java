package com.example.firoesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class NextActivity extends AppCompatActivity {
    Handler h = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        h.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent i = new Intent(NextActivity.this, MainActivity.class);
                startActivities(i);
                finish();
            }
        }, 5000);
    }

    private void startActivities(Intent i) {
    }
}