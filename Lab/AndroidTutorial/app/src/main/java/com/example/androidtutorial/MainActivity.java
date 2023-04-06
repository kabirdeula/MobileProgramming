package com.example.androidtutorial;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    public void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.activity_second);

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.button1:
//                Toast.makeText(this, "True Clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, TrueActivity.class);
                startActivity(intent);
                break;
            case R.id.button2:
//                Toast.makeText(this, "False Clicked", Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(MainActivity.this, FalseActivity.class);
                startActivity(intent1);
                break;

        }
    }
}
