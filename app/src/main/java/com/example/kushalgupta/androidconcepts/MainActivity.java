package com.example.kushalgupta.androidconcepts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.kushalgupta.androidconcepts.Adapter.ContentAdapter;
import com.example.kushalgupta.androidconcepts.Model.Contents;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.rv);
        ContentAdapter aadapter = new ContentAdapter(this, Contents.getContentsList());
        recyclerView.setAdapter(aadapter);

      //  StaggeredGridLayoutManager staggeredGridLayoutManager=new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        //  staggeredGridLayoutManager.setOrientation(staggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);


    }
}
