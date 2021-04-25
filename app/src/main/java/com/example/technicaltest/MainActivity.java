package com.example.technicaltest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String>listNumber;
    RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler = (RecyclerView)findViewById(R.id.recyclerId);
        recycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

        listNumber = new ArrayList<String>();

        for (int i = 1;i<=1000;i++) {
            listNumber.add((String) getText(R.string.number) +" "+ i);
        }

        AdapterNumber adapter = new AdapterNumber(listNumber);
        recycler.setAdapter(adapter);

    }
}