package com.example.actualcalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void findSoln(View view){
        Intent intent = getIntent();
        String nameToShow = intent.getStringExtra("NAME");

        TextView textView = findViewById(R.id.userName);
        textView.setText(nameToShow);
    }
}