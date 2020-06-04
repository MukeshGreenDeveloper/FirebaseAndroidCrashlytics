package com.bluetooth.crashlyticsfrebase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.crashButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                throw new RuntimeException("Test Crash"); // Force a crash
                while(1==1){
                    int a;
                    a=1923765132+1923765132;
                }
            }
        });
    }
}
