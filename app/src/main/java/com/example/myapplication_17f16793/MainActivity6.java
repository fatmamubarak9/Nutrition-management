package com.example.myapplication_17f16793;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity6 extends AppCompatActivity {
    TextView textView10,textView11,textView12;
    ImageView imageView10,imageView11,imageView12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);


        textView10=(TextView) findViewById(R.id.textV1);
        textView11=(TextView) findViewById(R.id.textV2);
        textView12=(TextView) findViewById(R.id.textV3);

        imageView10=(ImageView) findViewById(R.id.imageV1);
        imageView11=(ImageView) findViewById(R.id.imageV2);
        imageView12=(ImageView) findViewById(R.id.imageV3);
    }
}