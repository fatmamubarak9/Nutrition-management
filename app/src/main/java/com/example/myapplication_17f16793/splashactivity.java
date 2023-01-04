package com.example.myapplication_17f16793;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splashactivity extends AppCompatActivity {
    Handler H;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashactivity);
        H=new Handler();

        H.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent in=new Intent(splashactivity.this,MainActivity.class);
                startActivity(in);
                finish();
            }
        },5000);

    }
}