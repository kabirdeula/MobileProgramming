package com.mobileprogramming.userregister;

import android.os.Bundle;
import android.widget.*;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText et_name, et_username, et_email, et_password;
    private DatabaseHelper databaseHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        databaseHelper = new DatabaseHelper(this);

        et_name = findViewById(R.id.et_name);
        et_username = findViewById(R.id.et_username);
        et_email = findViewById(R.id.et_email);
        et_password = findViewById(R.id.et_password);
        Button btn_register = findViewById(R.id.btn_register);

        btn_register.setOnClickListener(view -> {
            String name = et_name.getText().toString();
            String username = et_username.getText().toString();
            String email = et_email.getText().toString();
            String password = et_password.getText().toString();

            long rowID = databaseHelper.insertData(name, username, email, password);
            if (rowID != -1) {
                Toast.makeText(getApplicationContext(), "User Registered Successfully", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getApplicationContext(), "Error occurred while registering user", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
