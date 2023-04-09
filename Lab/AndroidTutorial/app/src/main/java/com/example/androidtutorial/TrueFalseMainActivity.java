package com.example.androidtutorial;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TrueFalseMainActivity extends Activity implements View.OnClickListener {

    Button button_true, button_false;

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_second);

        button_true = findViewById(R.id.button1);
        button_false = findViewById(R.id.button2);

        button_true.setOnClickListener(this);
        button_false.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button1:
                Intent intentTrue = new Intent(TrueFalseMainActivity.this, TrueActivity.class);
                startActivity(intentTrue);
                break;
                case R.id.button2:
                    Intent intentFalse = new Intent(TrueFalseMainActivity.this, FalseActivity.class);
                    startActivity(intentFalse);
                    break;
        }
    }
}

