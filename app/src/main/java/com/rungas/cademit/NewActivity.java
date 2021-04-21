package com.rungas.cademit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {
    private TextView name;
    private String userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        //check if value is available
        if (getIntent()!=null){
            //using to key or name for data to find value
            userName = getIntent().getStringExtra("name");
        }

        //finding the view name
        name = findViewById(R.id.name);

        //we are setting the name to what the user entered
        name.setText(userName);
    }
}