package com.bl.a1912500467_aplikasigabungan_af;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ScrollViewActivity extends AppCompatActivity {

    Button android5, android6,android7,android8,android9,android10,android11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_view);

        android5 = findViewById(R.id.lollipop);
        android6 = findViewById(R.id.marshmallow);
        android7 = findViewById(R.id.nougat);
        android8 = findViewById(R.id.oreo);
        android9 = findViewById(R.id.pie);
        android10 = findViewById(R.id.android10);
        android11 = findViewById(R.id.android11);

        android5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScrollViewActivity.this, LollipopActivity.class));
            }
        });

        android6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScrollViewActivity.this, MarshMallowActivity.class));
            }
        });

        android7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScrollViewActivity.this, NougatActivity.class));
            }
        });

        android8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScrollViewActivity.this, OreoActivity.class));
            }
        });

        android9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScrollViewActivity.this, PieActivity.class));
            }
        });

        android10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScrollViewActivity.this, Android10Activity.class));
            }
        });

        android11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ScrollViewActivity.this, Android11Activity.class));
            }
        });

    }
}