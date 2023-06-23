package com.mobileprogramming.recyclerviewdemo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.*;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView view_recycler = findViewById(R.id.view_recycler);

        String[] name = {"Mobile Programming", "Distributed System", "Applied Economics", "Advanced Java Programming", "Network Programming"};
        String[] description = {"Chhetra Sir", "Nabaraj Sir", "Santosh Sir", "Yubaraj Sir", "Khusbu Ma'am"};

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        view_recycler.setLayoutManager(layoutManager);

        RecyclerView.Adapter adapter = new RecyclerView.Adapter() {
            @NonNull
            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                LayoutInflater inflater = LayoutInflater.from(parent.getContext());
                View listItem = inflater.inflate(R.layout.activity_recyclerview, parent, false);
                return new MyViewHolder(listItem);
            }

            @Override
            public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
                MyViewHolder myViewHolder = (MyViewHolder) holder;
                myViewHolder.tv_name.setText(name[position]);
                myViewHolder.tv_description.setText(description[position]);
            }

            @Override
            public int getItemCount() {
                return name.length;
            }
        };
        view_recycler.setAdapter(adapter);
    }

    private static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView tv_name, tv_description;

        MyViewHolder(View itemView){
            super(itemView);
            tv_name = itemView.findViewById(R.id.tv_name);
            tv_description = itemView.findViewById(R.id.tv_description);
        }
    }
}
