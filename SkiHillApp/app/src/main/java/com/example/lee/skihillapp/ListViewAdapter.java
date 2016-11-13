package com.example.lee.skihillapp;

/**
 * Created by LEE on 2016. 11. 9..
 */

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {
    // ArrayList for adding data in Adapter
    private ArrayList<ListViewItem> listViewItemList = new ArrayList<ListViewItem>() ;

    // ListViewAdapter generator
    public ListViewAdapter() {

    }

    // return the number of data in Adapter
    @Override
    public int getCount() {
        return listViewItemList.size() ;
    }

    // displaying data to View in position
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final int pos = position;
        final Context context = parent.getContext();

        // "listview_item" Layout inflate then convertView reference retained
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.listview_item, parent, false);
        }

        // Widget retained from View
        ImageView iconImageView = (ImageView) convertView.findViewById(R.id.imageView1) ;
        TextView titleTextView = (TextView) convertView.findViewById(R.id.textView1) ;
        TextView descTextView = (TextView) convertView.findViewById(R.id.textView2) ;

        // data reference in position from Data Set(listViewItemList)
        ListViewItem listViewItem = listViewItemList.get(position);

        // apply the data to widget
        iconImageView.setImageDrawable(listViewItem.getIcon());
        titleTextView.setText(listViewItem.getTitle());
        descTextView.setText(listViewItem.getDesc());

        return convertView;
    }

    // row id return from each position
    @Override
    public long getItemId(int position) {
        return position ;
    }

    // data return from each position
    @Override
    public Object getItem(int position) {
        return listViewItemList.get(position) ;
    }

    // function for adding item data
    public void addItem(Drawable icon, String title, String desc) {
        ListViewItem item = new ListViewItem();

        item.setIcon(icon);
        item.setTitle(title);
        item.setDesc(desc);

        listViewItemList.add(item);
    }
}