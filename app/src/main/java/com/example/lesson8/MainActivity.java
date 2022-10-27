package com.example.lesson8;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView tvMain;
    private Button btnMain;
    private EditText etName;

    //this Это контекст данного активити

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMain = findViewById(R.id.tv_main);
        btnMain = findViewById(R.id.btn_main);
        etName = findViewById(R.id.et_main);

        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                String text = etName.getText().toString();
                intent.putExtra("Miku", text);
                startActivity(intent);
                finish();
            }
        });

        Log.d("Leona", "onCreate: ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Leona", "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Leona", "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Leona", "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Leona", "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Leona", "onDestroy: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Leona", "onRestart: ");
    }
}