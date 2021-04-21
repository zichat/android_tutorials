package com.rungas.cademit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText name, password;
    private CheckBox checkBox;
    private Button registerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pratice_layout);

        name = findViewById(R.id.name);
        password = findViewById(R.id.password);
        checkBox = findViewById(R.id.checkBox);
        registerBtn = findViewById(R.id.registerBtn);

        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName = name.getText().toString();
                String userPassword = password.getText().toString();
                
                if (userName.isEmpty()){
                    name.setError("username cannot be empty");
                }else if (userPassword.isEmpty()){
                    password.setError("password cannot be empty");
                }else if (!checkBox.isChecked()){
                    Toast.makeText(MainActivity.this, "accept terms and conditions", Toast.LENGTH_SHORT).show();
                }else {
                   // Toast.makeText(MainActivity.this, "welcome to cadmit", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, NewActivity.class);
                    intent.putExtra("name", userName);
                    startActivity(intent);
                }

            }
        });
    }
}