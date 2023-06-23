package com.mobileprogramming.listviewdemo;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView list_view = findViewById(R.id.list_view);

        String names[] = {"Mobile Programming", "Distributed System", "Applied Economics", "Advanced Java Programming", "Network Programming"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.activity_listview, R.id.list_item, names);
        list_view.setAdapter(adapter);
    }
}
