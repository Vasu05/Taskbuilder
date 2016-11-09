package com.example.vasuchand.taskbuilder;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;

    private RecyclerView recyclerView;
    public static List<data> movieList = new ArrayList<>();
    private data datas;
    public static adapter mpter;
    private ImageView task;
    ViewPager vp ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        task = (ImageView)findViewById(R.id.task);
        setSupportActionBar(toolbar);

            recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
            LinearLayoutManager layoutManager
                    = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
            recyclerView.setLayoutManager(layoutManager);
            recyclerView.setNestedScrollingEnabled(false);
            recyclerView.setItemAnimator(new DefaultItemAnimator());
            mpter = new adapter(movieList);
            recyclerView.setAdapter(mpter);
            //mpter = new adapter(movieList);
        recyclerView.addOnItemTouchListener(new RecycleviewTochListerner(getApplicationContext(), recyclerView, new RecycleviewTochListerner.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                data movie = movieList.get(position);
                //Toast.makeText(getApplicationContext(), movie.getHeading()+ " is selected!", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this, viewpager.class);
                i.putExtra("position",position);
                startActivity(i);
//                vp = (ViewPager)findViewById(R.id.viewpager);
//                vp.setAdapter(new viewpager_Adapter(MainActivity.this,movieList));

            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));
        if(savedInstanceState == null) {

            load();
        }
        task.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, add_task.class));

            }
        });
    }

    public void load(){
        datas = new data("Mad Max: Fury Road", "it is create by  Vasu");
        movieList.add(datas);
        datas = new data("Mad Max: Fury Road", " it is create By Dhruv");
        movieList.add(datas);
        datas = new data("Mad Max: Fury Road", " it is create By ashutosh");
        movieList.add(datas);
        datas = new data("Mad Max: Fury Road", "it is create By Darvesh");
        movieList.add(datas);
        datas = new data("Mad Max: Fury Road", "it is create By arti");
        movieList.add(datas);
        datas = new data("Mad Max: Fury Road", "it is create By aarti");
        movieList.add(datas);
        datas = new data("Mad Max: Fury Road", "it is create By Dhruv");
        movieList.add(datas);
        datas = new data("Mad Max: Fury Road", "it is create By Dhruv");
        movieList.add(datas);
        datas = new data("Mad Max: Fury Road", "it is create By Dhruv");
        movieList.add(datas);
        mpter.notifyDataSetChanged();
    }

}
