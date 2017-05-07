package com.example.smart.newgame;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

class ViewHolder{

    ImageView songpic1_imageView;
    TextView songnam1_TextView;
}

public class SonglistAdapter extends BaseAdapter{
    Context context;


    public SonglistAdapter(Context context, ArrayList<song_items> song_itemsArrayList) {
        this.context = context;
        this.song_itemsArrayList = song_itemsArrayList;
    }

    ArrayList<song_items> song_itemsArrayList;

    @Override
    public int getCount() {
        return song_itemsArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return this.song_itemsArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewholder = new ViewHolder();
        if(convertView==null){
            convertView = LayoutInflater.from(context).inflate(R.layout.item,null);
            viewholder.songpic1_imageView = (ImageView)convertView.findViewById(R.id.songpicture);
            viewholder.songnam1_TextView = (TextView)convertView.findViewById(R.id.songname);
            convertView.setTag(viewholder);
        }else{
            viewholder = (ViewHolder) convertView.getTag();
        }
        viewholder.songpic1_imageView.setImageResource(song_itemsArrayList.get(position).getSongpic());
        viewholder.songnam1_TextView.setText(song_itemsArrayList.get(position).getSongnam());

       return convertView;
    }
}
