package com.example.lee.lakelouiseapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

import com.github.ksoichiro.android.observablescrollview.ObservableListView;
import com.github.ksoichiro.android.observablescrollview.ObservableScrollViewCallbacks;
import com.github.ksoichiro.android.observablescrollview.ScrollState;

import static com.example.lee.lakelouiseapp.R.drawable.logo_small_icon;

public class ReviewActivity extends AppCompatActivity implements ObservableScrollViewCallbacks {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);
        this.setTitle("REVIEW");

        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeAsUpIndicator(logo_small_icon);
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);


        final ObservableListView listView;
        final review_adapter adapter;

        // Adapter
        adapter = new review_adapter() ;

        // list view reference and Adapter putting
        listView = (ObservableListView) findViewById(R.id.review_list);
        listView.setScrollViewCallbacks(this);
        listView.setAdapter(adapter);

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

    @Override
    public void onScrollChanged(int scrollY, boolean firstScroll, boolean dragging) {
    }

    @Override
    public void onDownMotionEvent() {
    }

    public void onUpOrCancelMotionEvent(ScrollState scrollState) {
        ActionBar ab = getSupportActionBar();
        if (ab == null) {
            return;
        }
        if (scrollState == ScrollState.UP) {
            if (ab.isShowing()) {
                ab.hide();
            }
        } else if (scrollState == ScrollState.DOWN) {
            if (!ab.isShowing()) {
                ab.show();
            }
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case android.R.id.home:
                Intent homeIntent = new Intent(this, MainActivity.class);
                homeIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(homeIntent);
        }
        return (super.onOptionsItemSelected(menuItem));
    }

}
