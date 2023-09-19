package com.salatech.digitaltasbeeh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import android.widget.TextView;

import android.widget.Button;

public class MainActivity extends AppCompatActivity {
int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button count_btn = findViewById(R.id.countbutton);
        TextView count_view = findViewById(R.id.counttext);
        Button re_btn = findViewById(R.id.resetbutton);
        count = 0;
        count_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count ++;
                count_view.setText(String.valueOf(count));
            }

        });
        re_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = 0;
                count_view.setText(String.valueOf(count));
            }
        });
    }
}