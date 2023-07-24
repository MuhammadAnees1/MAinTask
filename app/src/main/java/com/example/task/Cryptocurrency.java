package com.example.task;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class Cryptocurrency extends AppCompatActivity {

    private RecyclerView.Adapter adapter2;
    private RecyclerView recyclerView;
    public Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cryptocurrency);


        recyclerViewCategory();

    }

    private void recyclerViewCategory() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 3, GridLayoutManager.VERTICAL, false);
        recyclerView = findViewById(R.id.recyclerView2);
        recyclerView.setLayoutManager(gridLayoutManager);

        ArrayList<RecycleView3> category = new ArrayList<>();
        category.add(new RecycleView3("Layout Docs ", "PDF  10MB ", "pdf_icon"));
        category.add(new RecycleView3("Presentation ", "MOV", "video"));
        category.add(new RecycleView3("All Assets", "Zip 10MB", "zip"));
        category.add(new RecycleView3("Layout Docs ", "WAV 10MB", "file"));
        category.add(new RecycleView3("Layout Docs", "XLS 10MB", "excel"));
        category.add(new RecycleView3("Layout Docs", "DOCX 10MB", "word"));


        adapter2 = new CategoryAdaptor3(category);
        recyclerView.setAdapter(adapter2);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

    }
}