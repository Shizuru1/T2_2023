package com.example.redbackproject1test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Map;

public class TrackActivity extends AppCompatActivity {

    Button newButton, existingButton, locationButton;
    ImageView tBackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track);

        newButton = findViewById(R.id.newButton);
        existingButton = findViewById(R.id.existingButton);
        locationButton = findViewById(R.id.locationButton);
        tBackButton = findViewById(R.id.imageView3);

        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TrackActivity.this, MapActivity.class);
                startActivity(i);
            }
        });

        existingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TrackActivity.this, MapActivity.class);
                startActivity(i);
            }
        });

        locationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TrackActivity.this, MapActivity.class);
                startActivity(i);
            }
        });

        tBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TrackActivity.super.onBackPressed();
            }
        });
    }
}