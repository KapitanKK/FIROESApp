package com.example.firoesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ViewFlipper viewFlipper;
    Button next1;
    Button prev1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.baseline_bedtime_24);
        setContentView(R.layout.activity_main);


        // buttons in image next or previous
        viewFlipper = (ViewFlipper) findViewById(R.id.ViewFlipper);
        next1 = (Button) findViewById(R.id.next1);
        prev1 = (Button) findViewById(R.id.prev1);

        next1.setOnClickListener(this);
        prev1.setOnClickListener(this);

    }

    @Override
    public void onClick(View btn) {

        if (btn == next1){
            viewFlipper.showNext();
        } else if (btn == prev1){
            viewFlipper.showPrevious();
        }

    }
}
