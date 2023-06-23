package com.mobileprogramming.gridviewdemo;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView view_grid = findViewById(R.id.view_grid);

        String names[] = {"Mobile Programming", "Distributed System", "Applied Economics", "Advanced Java Programming", "Network Programming"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.activity_gridview, R.id.list_item, names);
        view_grid.setAdapter(adapter);
    }
}
