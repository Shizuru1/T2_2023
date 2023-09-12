package com.example.redbackproject1test;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SettingsActivity extends AppCompatActivity {

    Button helpButton, switchButton, customiseButton, langButton, uaButton;
    ImageView sBackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        helpButton = findViewById(R.id.helpButton);
        switchButton = findViewById(R.id.switchButton);
        customiseButton = findViewById(R.id.customiseButton);
        langButton = findViewById(R.id.langButton);
        uaButton = findViewById(R.id.uaButton);
        sBackButton = findViewById(R.id.imageView2);

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

        langButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Todo intent
            }
        });

        uaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Todo intent
            }
        });

        sBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SettingsActivity.super.onBackPressed();
            }
        });
    }
}