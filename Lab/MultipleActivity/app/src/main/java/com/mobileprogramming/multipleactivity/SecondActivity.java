package com.mobileprogramming.multipleactivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    Button btn_back;
    @Override
    protected void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.activity_second);

        btn_back = findViewById(R.id.btn_back);
        btn_back.setOnClickListener(view -> {
            Intent intent2 = new Intent(SecondActivity.this, MainActivity.class);
            startActivity(intent2);
        });
    }
}
