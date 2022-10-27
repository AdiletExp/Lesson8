package com.example.lesson8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView = findViewById(R.id.tv_name);

        String newValue = getIntent().getStringExtra("Miku");

        Log.d("Second", "onCreate: " + newValue);
        Log.d("Second", "onCreate: " + getIntent().getStringExtra("Miku"));
        textView.setText(newValue);
    }
}