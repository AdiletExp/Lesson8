package com.example.lesson8;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;

public class MainActivity4 extends AppCompatActivity {

    @Override
    public void setFinishOnTouchOutside(boolean finish) {
        super.setFinishOnTouchOutside(finish);
        
    protected void onCreate(Bundle sState) {
        super.onCreate(sState);
        setContentView(R.layout.activity_main2);
    }

    @Override
    public boolean onCreatePanelMenu(int featureId, @NonNull Menu menu) {
        return super.onCreatePanelMenu(featureId, menu);
    }
}