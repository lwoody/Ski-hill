package com.example.lee.skihillapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

public class HotelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // shows the icon next to title
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        this.setTitle(title);

        ListView listview ;
        ListViewAdapter adapter;

        // Adapter
        adapter = new ListViewAdapter() ;

        // listview inference and Adapter
        listview = (ListView) findViewById(R.id.listview1);
        listview.setAdapter(adapter);

        // add first item
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.ic_home_black_24dp),
                "Hotel1", "price / distance / link") ;
        // add second item
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.ic_hotel_black_24dp),
                "Hotel2", "\nprice / distance / link") ;
        // add third item
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.ic_location_city_black_24dp),
                "Hotel3", "price / distance / link") ;


    }

}
