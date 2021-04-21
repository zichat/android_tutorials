package com.rungas.cademit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class BottomNavigation extends AppCompatActivity {
    private TextView selected;
    private BottomNavigation bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation);

        selected = findViewById(R.id.selected);
        //bottomNavigation = (BottomNavigation) findViewById(R.id.bottomNav);

    }


}