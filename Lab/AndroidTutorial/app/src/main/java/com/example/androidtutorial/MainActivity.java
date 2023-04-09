package com.example.androidtutorial;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends Activity{
    EditText edit_principle, edit_time, edit_rate;
    Button button_calculate;
    TextView text_results;

    @Override
    public void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.activity_simple_interest);

        edit_principle = (EditText)findViewById(R.id.principle);
        edit_time = (EditText)findViewById(R.id.time);
        edit_rate = (EditText)findViewById(R.id.rate);

        button_calculate = findViewById(R.id.calculate);

        text_results = (TextView)findViewById(R.id.text_results);

        button_calculate.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                float float_principle = Float.parseFloat(edit_principle.getText().toString());
                float float_time = Float.parseFloat(edit_time.getText().toString());
                float float_rate = Float.parseFloat(edit_rate.getText().toString());

                float float_simple_interest =  (float_principle * float_time * float_rate) / 100;

                text_results.setText(Float.toString(float_simple_interest));
            }
        });

        
    }
}
