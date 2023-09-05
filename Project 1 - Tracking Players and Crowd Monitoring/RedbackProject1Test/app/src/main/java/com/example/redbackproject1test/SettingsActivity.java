package com.example.redbackproject1test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SettingsActivity extends AppCompatActivity {

    Button helpButton, switchButton, customiseButton, optionsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        helpButton = findViewById(R.id.helpButton);
        switchButton = findViewById(R.id.switchButton);
        customiseButton = findViewById(R.id.customiseButton);
        optionsButton = findViewById(R.id.optionsButton);

        helpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Todo intent
            }
        });

        switchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Todo intent
            }
        });

        customiseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Todo intent
            }
        });

        optionsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Todo intent
            }
        });
    }
}