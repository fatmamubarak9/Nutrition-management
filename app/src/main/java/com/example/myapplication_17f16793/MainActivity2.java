package com.example.myapplication_17f16793;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
      TextView choose;
      Button bn1,bn2,bn3,bn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        choose= (TextView)findViewById(R.id.choose);
        bn1 = (Button) findViewById(R.id.bn1);
        bn2 = (Button) findViewById(R.id.bn2);
        bn3 = (Button) findViewById(R.id.bn3);
        bn4= (Button) findViewById(R.id.bn4);


        bn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(intent);
            }
        });
        bn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity2.this,MainActivity4.class);
                startActivity(intent);
            }
        });

        bn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity2.this,MainActivity5.class);
                startActivity(intent);
            }
        });
        bn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity2.this,MainActivity6.class);
                startActivity(intent);
            }
        });
    }
}