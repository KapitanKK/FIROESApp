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
        h.postDelayed(() -> {
            Intent a = new Intent( NextActivity.this, MainActivity.class);
            startActivities(a);
            finish();

        }, 5000);

    }

    private void startActivities(Intent a) {
    }
}