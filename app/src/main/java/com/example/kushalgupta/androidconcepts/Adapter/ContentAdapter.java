package com.example.kushalgupta.androidconcepts.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.kushalgupta.androidconcepts.R;

import java.util.ArrayList;

import com.example.kushalgupta.androidconcepts.Model.Contents;

/**
 * Created by kushalgupta on 23/12/17.
 */

public class ContentAdapter extends RecyclerView.Adapter<ContentAdapter.MyViewHolder> {

   private ArrayList<Contents> contentList;
   private LayoutInflater layoutInflater;

    public ContentAdapter(Context c, ArrayList<Contents> contentList) {

        layoutInflater=LayoutInflater.from(c);

        this.contentList = contentList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

View view=layoutInflater.inflate(R.layout.contents,parent,false);
MyViewHolder holder=new MyViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(ContentAdapter.MyViewHolder holder, int position) {

        Contents contents=contentList.get(position);
        holder.setData(contents,position);


    }


    @Override
    public int getItemCount() {
        return contentList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView textView;
private int position;
private Contents contents;

        public MyViewHolder(View itemView)

        {super(itemView);

            textView=itemView.findViewById(R.id.tv);




        }

        public void setData(Contents contents, int position) {
            this.textView.setText(contents.getTopic());
            this.position=position;
            this.contents=contents;
        }
    }
}
