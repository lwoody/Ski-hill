package com.example.lee.skihillapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class SkihillActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skihill);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //        shows the icon next to title
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        this.setTitle(title);


    }

    public void onClickLocation(View v){
        Intent intent = new Intent(SkihillActivity.this, LocationActivity.class);
        intent.putExtra("title","Location & Bus - "+this.getTitle());

        startActivity(intent);
    }

    public void onClickLift(View v){
        Intent intent = new Intent(SkihillActivity.this, LiftActivity.class);
        intent.putExtra("title","Lift & Rent - "+this.getTitle());

        startActivity(intent);
    }

    public void onClickHotel(View v){
        Intent intent = new Intent(SkihillActivity.this, HotelActivity.class);
        intent.putExtra("title","Hotel - "+this.getTitle());

        startActivity(intent);
    }

    public void onClickOverview(View v){
        Intent intent = new Intent(SkihillActivity.this, OverviewActivity.class);
        intent.putExtra("title","Resort Overview - "+this.getTitle());

        startActivity(intent);
    }

    public void onClickRoute(View v){
        Intent intent = new Intent(SkihillActivity.this, RouteMakingActivity.class);
        intent.putExtra("title","Route Making - "+this.getTitle());

        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_each, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        return super.onOptionsItemSelected(item);
    }

}
