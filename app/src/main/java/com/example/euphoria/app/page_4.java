package com.example.euphoria.app;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

import java.util.Random;

public class page_4 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_4);

        Button button_correct3 = (Button) findViewById(R.id.button_correct3);
        button_correct3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                v.setBackgroundColor(Color.GREEN);
                startActivity(new Intent(page_4.this, last_page.class));

            }
        });
        Button but11 = (Button) findViewById(R.id.but11);
        but11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                v.setBackgroundColor(Color.RED);
                startActivity(new Intent(page_4.this, page_4.class));

            }
        });
        Button but12 = (Button) findViewById(R.id.but12);
        but12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                v.setBackgroundColor(Color.RED);
                startActivity(new Intent(page_4.this, page_4.class));

            }
        });
        Button but13 = (Button) findViewById(R.id.but13);
        but13.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                v.setBackgroundColor(Color.RED);
                startActivity(new Intent(page_4.this, page_4.class));

            }
        });
    }
}