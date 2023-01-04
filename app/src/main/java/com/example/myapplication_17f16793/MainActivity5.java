package com.example.myapplication_17f16793;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {
    TextView textView7,textView8,textView9;
    ImageView imageView7,imageView8,imageView9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        textView7=(TextView) findViewById(R.id.textView7);
        textView8=(TextView) findViewById(R.id.textView9);
        textView9=(TextView) findViewById(R.id.textView10);

        imageView7=(ImageView) findViewById(R.id.imageView10);
        imageView8=(ImageView) findViewById(R.id.imageView11);
        imageView9=(ImageView) findViewById(R.id.imageView13);
    }
}