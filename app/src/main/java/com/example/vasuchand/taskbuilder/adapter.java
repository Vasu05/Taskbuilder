package com.example.vasuchand.taskbuilder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Vasu Chand on 11/9/2016.
 */

public class adapter extends RecyclerView.Adapter<adapter.MyViewHolder>{

    private List<data> moviesList;

   public class MyViewHolder extends RecyclerView.ViewHolder {
       public TextView t1,t2;
       public MyViewHolder(View view) {
           super(view);
           t1 = (TextView)view.findViewById(R.id.t1);
           t2 = (TextView)view.findViewById(R.id.t3);
       }

   }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext())
            .inflate(R.layout.item_list, parent, false);


            return new MyViewHolder(itemView);
            }






     public adapter(List<data> moviesList){
        this.moviesList = moviesList;
     }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
            data movie = moviesList.get(position);
            holder.t1.setText(movie.getHeading());
            holder.t2.setText(movie.getCreate());

        }
    @Override
    public int getItemCount() {
        return moviesList.size();
        }
}