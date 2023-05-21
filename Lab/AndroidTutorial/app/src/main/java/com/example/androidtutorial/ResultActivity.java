package com.example.androidtutorial;

import android.app.Activity;
import android.os.Bundle;
import android.widget.*;
import android.content.Intent;

public class ResultActivity extends Activity {

    TextView textResults;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        textResults = (TextView)findViewById(R.id.text_results);

        Intent intent = getIntent();
        String results = intent.getStringExtra("name");
        textResults.setText(results);

    }
}
