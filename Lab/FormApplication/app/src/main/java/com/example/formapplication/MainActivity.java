package com.example.formapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.*;

public class MainActivity extends Activity {
    EditText edit_id, edit_name;
    RadioButton radio_male, radio_female;
    Spinner spinner_program;
    Button button_submit;
    TextView text_results;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        edit_id = findViewById(R.id.edit_id);
        edit_name = findViewById(R.id.edit_name);

        radio_male = findViewById(R.id.radio_male);
        radio_female = findViewById(R.id.radio_female);

        spinner_program = findViewById(R.id.spinner_program);

        button_submit = findViewById(R.id.button_submit);

        text_results = findViewById(R.id.text_result);

        button_submit.setOnClickListener(view -> {
            String id = edit_id.getText().toString();
            String name = edit_name.getText().toString();
            String gender;
            if(radio_male.isChecked()) gender = "Male";
            else gender = "Female";
            String program = spinner_program.getSelectedItem().toString();

            text_results.setText(String.format("Student ID: %s\nStudent Name: %s\nGender: %s\nProgram: %s", id, name,gender, program));
        });
    }
}
