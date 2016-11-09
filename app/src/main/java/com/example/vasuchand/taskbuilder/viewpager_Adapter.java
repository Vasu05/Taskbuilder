package com.example.vasuchand.taskbuilder;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.PagerTabStrip;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Vasu Chand on 11/9/2016.
 */

public class viewpager_Adapter extends PagerAdapter {
    private Context mContext;
    private List<data> moviesList;

    public viewpager_Adapter(Context context,List<data> moviesList) {
        mContext = context;
        this.moviesList = moviesList;
    }


    @Override
    public Object instantiateItem(ViewGroup collection, int position) {
        data modelObject = moviesList.get(position);
        LayoutInflater inflater = LayoutInflater.from(mContext);
        ViewGroup layout = (ViewGroup) inflater.inflate(R.layout.sliding, collection, false);

        TextView t1  =(TextView)layout.findViewById(R.id.t1);
        t1.setText(modelObject.getCreate());
        collection.addView(layout);
        return layout;
    }

    @Override
    public void destroyItem(ViewGroup collection, int position, Object view) {
        collection.removeView((View) view);
    }

    @Override
    public int getCount() {
        return moviesList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }


}
