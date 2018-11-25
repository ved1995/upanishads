package com.avdevelopers.upanishads;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<String> upanishads;
    private UpanishadAdapter upanishadAdapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeViews();
    }

    private void initializeViews() {
        upanishads=Arrays.asList("Aitereya","Karika","Kena","Mandukya","Isavasya","Katha","Mundaka","Prasna","Brihadaranyaka","Taittiriya","Svetashvatra");

        recyclerView=(RecyclerView)findViewById(R.id.upanishadNameRecycler);
        upanishadAdapter=new UpanishadAdapter(this,upanishads);
        RecyclerView.LayoutManager linearLayoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(upanishadAdapter);
    }

}
