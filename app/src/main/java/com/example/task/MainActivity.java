package com.example.task;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {
     RecyclerView.Adapter adapter, adapter2;
    private RecyclerView recyclerView, recyclerView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView1);
        recyclerViewCategory();

        recyclerView2 = findViewById(R.id.recyclerView2);
        recyclerViewCategory2();
    }
    private void recyclerViewCategory() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);

        ArrayList<RecycleView1> category = new ArrayList<>();
        category.add(new RecycleView1("Cryptocurrency Landing Page", "Cryptocurrency Landing Page"));
        category.add(new RecycleView1("Statistic Dashboard", "Statistic Dashboard"));
        category.add(new RecycleView1("Static DBMS", "Static DBMS"));

        adapter = new CategoryAdaptor(category);
        recyclerView.setAdapter(adapter);
    }
    private void recyclerViewCategory2() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView2.setLayoutManager(layoutManager);

        ArrayList<RecycleView2> categoryDomains = new ArrayList<>();
        categoryDomains.add(new RecycleView2("NDA Review for web project ", "today 10 pm", "video1"));
        categoryDomains.add(new RecycleView2("Email Reply for Green Project ", "today 10 pm", "mail"));
        categoryDomains.add(new RecycleView2("All Assets", "Zip 10MB", "zip"));
        categoryDomains.add(new RecycleView2("Layout Docs ", "WAV 10MB", "file"));
        categoryDomains.add(new RecycleView2("Layout Docs", "XLS 10MB", "excel"));
        categoryDomains.add(new RecycleView2("Layout Docs", "DOCX 10MB", "word"));

        adapter2 = new CategoryAdaptor2(categoryDomains);
        recyclerView2.setAdapter(adapter2);
    }
}