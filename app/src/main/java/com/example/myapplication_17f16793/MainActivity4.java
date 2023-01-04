package com.example.myapplication_17f16793;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
    TextView textView4,textView5,textView6;
    ImageView imageView4,imageView5,imageView6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        textView4=(TextView) findViewById(R.id.textView4);
        textView5=(TextView) findViewById(R.id.textView6);
        textView6=(TextView) findViewById(R.id.textView5);

        imageView4=(ImageView) findViewById(R.id.imageView2);
        imageView5=(ImageView) findViewById(R.id.imageView3);
        imageView6=(ImageView) findViewById(R.id.imageView5);
    }
}