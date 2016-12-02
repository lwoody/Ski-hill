package com.example.lee.lakelouiseapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by LEE on 2016. 12. 1..
 */

public class lift_adapter extends BaseAdapter {

    // Adapter에 추가된 데이터를 저장하기 위한 ArrayList
    private ArrayList<list_item> listViewItemList = new ArrayList<list_item>() ;

    // ListViewAdapter의 생성자
    public lift_adapter() {

    }

    // Adapter에 사용되는 데이터의 개수를 리턴. : 필수 구현
    @Override
    public int getCount() {
        return listViewItemList.size() ;
    }

    // position에 위치한 데이터를 화면에 출력하는데 사용될 View를 리턴. : 필수 구현
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final int pos = position;
        final Context context = parent.getContext();

        // "listview_item" Layout을 inflate하여 convertView 참조 획득.
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.lift_items, parent, false);
        }

        // 화면에 표시될 View(Layout이 inflate된)으로부터 위젯에 대한 참조 획득

        LinearLayout liftItemView = (LinearLayout) convertView.findViewById(R.id.lift_item_layout);
        TextView titleTextView = (TextView) convertView.findViewById(R.id.liftTitle) ;
        TextView statusTextView = (TextView) convertView.findViewById(R.id.liftStatus);
        TextView level1TextView = (TextView) convertView.findViewById(R.id.level1);
        TextView level2TextView = (TextView) convertView.findViewById(R.id.level2);
        TextView level3TextView = (TextView) convertView.findViewById(R.id.level3);
        TextView level4TextView = (TextView) convertView.findViewById(R.id.level4);

        // Data Set(listViewItemList)에서 position에 위치한 데이터 참조 획득

        list_item listViewItem = listViewItemList.get(position);

        // 아이템 내 각 위젯에 데이터 반영
        liftItemView.setEnabled(listViewItem.getStatus());
        statusTextView.setText(listViewItem.getDesc());
        statusTextView.setTextColor(listViewItem.getStatusColor());
        titleTextView.setText(listViewItem.getTitle());
        level1TextView.setBackgroundColor(listViewItem.getColor1());
        level2TextView.setBackgroundColor(listViewItem.getColor2());
        level3TextView.setBackgroundColor(listViewItem.getColor3());
        level4TextView.setBackgroundColor(listViewItem.getColor4());


        return convertView;
    }

    // 지정한 위치(position)에 있는 데이터와 관계된 아이템(row)의 ID를 리턴. : 필수 구현
    @Override
    public long getItemId(int position) {
        return position ;
    }

    // 지정한 위치(position)에 있는 데이터 리턴 : 필수 구현
    @Override
    public Object getItem(int position) {
        return listViewItemList.get(position) ;
    }

    // 아이템 데이터 추가를 위한 함수. 개발자가 원하는대로 작성 가능.
    public void addItem( String title, String statusText, Integer levelColor1, Integer levelColor2, Integer levelColor3, Integer levelColor4, Integer statusColor, Boolean status) {
        list_item item = new list_item();


        item.setTitle(title);
        item.setDesc(statusText);
        item.setColor1(levelColor1);
        item.setColor2(levelColor2);
        item.setColor3(levelColor3);
        item.setColor4(levelColor4);
        item.setStatusColor(statusColor);
        item.setStatus(status);

        listViewItemList.add(item);
    }


}
