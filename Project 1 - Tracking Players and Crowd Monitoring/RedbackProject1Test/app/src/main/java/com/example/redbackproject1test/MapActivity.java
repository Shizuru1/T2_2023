package com.example.redbackproject1test;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class MapActivity extends AppCompatActivity implements OnMapReadyCallback {

    ArrayList<LatLng> locations = new ArrayList<>();
    ArrayList<String> names = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        for (int i = 0; i < 25; i++) {
            locations.add(new LatLng(ThreadLocalRandom.current().nextDouble(-90.00000d, 90.00000d), ThreadLocalRandom.current().nextDouble(-180.00000d, 180.00000d)));
            names.add("placeholder");
        }

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        Polyline polyline;
        PolylineOptions polylineOptions = new PolylineOptions().clickable(true);
        for (int i = 0; i < locations.size(); i++) {
            LatLng placeLatLng = locations.get(i);
            googleMap.addMarker(new MarkerOptions()
                    .title(names.get(i))
                    .position(placeLatLng));
            polyline = googleMap.addPolyline(polylineOptions.add(locations.get(i)));
        }
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(-37.840935, 	144.946457)));
    }
}