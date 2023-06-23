package com.mobileprogramming.popupmenudemo;

import android.os.Bundle;
import android.widget.*;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_menu = findViewById(R.id.btn_menu);
        btn_menu.setOnClickListener(view -> {
            PopupMenu popupMenu = new PopupMenu(this, view);

            popupMenu.getMenuInflater().inflate(R.menu.menu_main, popupMenu.getMenu());
            popupMenu.setOnMenuItemClickListener(item -> {
                int id = item.getItemId();

                if (id == R.id.item1) {
                    // Handle Option 1 click
                    Toast.makeText(MainActivity.this, "Option 1 clicked", Toast.LENGTH_SHORT).show();
                    return true;
                } else if (id == R.id.item2) {
                    // Handle Option 2 click
                    Toast.makeText(MainActivity.this, "Option 2 clicked", Toast.LENGTH_SHORT).show();
                    return true;
                }
                return false;
            });
            popupMenu.show();
        });
    }
}
