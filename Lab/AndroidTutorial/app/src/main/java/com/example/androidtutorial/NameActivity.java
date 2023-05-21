package com.example.androidtutorial;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.*;

public class NameActivity extends Activity {

    EditText editName;

    Button btnSend;

    @Override
    public void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.activity_form_name);

        editName = (EditText) findViewById(R.id.edit_name);

        btnSend = findViewById(R.id.btn_send);
        btnSend.setOnClickListener(view -> {
            String result = editName.getText().toString();
            Intent intent = new Intent(getApplicationContext(), ResultActivity.class);
            intent.putExtra("name", result);
            startActivity(intent);
        });
    }
}
