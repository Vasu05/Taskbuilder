package com.example.vasuchand.taskbuilder;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class viewpager extends AppCompatActivity {
     ViewPager vp ;
     Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewpager);
        vp = (ViewPager)findViewById(R.id.viewpager);
        vp.setAdapter(new viewpager_Adapter(this,MainActivity.movieList));
        i = getIntent();
        int a = i.getIntExtra("position",0);
        System.out.println(a);
        vp.setCurrentItem(a);

    }
}
