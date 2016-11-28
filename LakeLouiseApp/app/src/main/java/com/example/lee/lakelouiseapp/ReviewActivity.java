package com.example.lee.lakelouiseapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;

public class ReviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);

        final ListView listview ;
        final review_adapter adapter;

        // Adapter
        adapter = new review_adapter() ;

        // list view reference and Adapter putting
        listview = (ListView) findViewById(R.id.review_list);
        listview.setAdapter(adapter);

        // adding first item
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.selectedroute),
                "Grizzly Express", "The best conditions ever to ski i have ever experienced!","10m 31s") ;
        // second item
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.selectedroute),
                "Top of the world", "I don't recommend this route. It was to difficult.","10m 31s") ;
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.selectedroute),
                "Paradise", "Not only is the snow condition good but also the landscape is really awsome.", "15m 10s") ;
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.selectedroute),
                "Grizzly Express", "It's not bad for advanced skiers and snowboarders.","9m 24s") ;
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.selectedroute),
                "Summit Platter", "The worst route in this ski hill..","17m 08s") ;
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.selectedroute),
                "Glacier Express", "Excellent route for beginners!","8m 03s") ;

    }

    public void onClickTry(View v){startActivity(new Intent(this, RouteShowActivity.class));}

}
