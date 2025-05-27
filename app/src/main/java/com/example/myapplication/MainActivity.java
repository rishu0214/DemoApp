package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    LinearLayout pit, promobox;
    TextView support;
    LinearLayout ll1 , ll2 , ll3, ll4 ;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pit = findViewById(R.id.pit);
        support = findViewById(R.id.supportButton);


        pit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Intent_Page.class);
                startActivity(intent);
            }
        });

        support.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Intent_Page.class);
                startActivity(intent);
            }
        });

        promobox = findViewById(R.id.promoBox);
        promobox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  = new Intent(MainActivity.this, Intent_Page.class);
                startActivity(intent);
            }
        });


        ll1 = findViewById(R.id.ll1);
        ll1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Refreshed", Toast.LENGTH_SHORT).show();
            }
        });

        ll2 = findViewById(R.id.ll2);
        ll2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Cashback Received", Toast.LENGTH_SHORT).show();
            }
        });

        ll3 = findViewById(R.id.ll3);
        ll3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Edit Your Profile", Toast.LENGTH_SHORT).show();
            }
        });

        ll4 = findViewById(R.id.ll4);
        ll4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Server Down", Toast.LENGTH_SHORT).show();
            }
        });

    }
}