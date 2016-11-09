package com.example.lee.skihillapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

    public void onClickLakeLouise(View v){
        Intent intent = new Intent(MainActivity.this, EachSkihill.class);
        intent.putExtra("title","Lake Louise");

        startActivity(intent);

    }

    public void onClickNorquay(View v){
        Intent intent = new Intent(MainActivity.this, EachSkihill.class);
        intent.putExtra("title","Norquay");

        startActivity(intent);

    }

    public void onClickSunshine(View v){
        Intent intent = new Intent(MainActivity.this, EachSkihill.class);
        intent.putExtra("title","Sunshine Village");

        startActivity(intent);

    }

    public void onClickNakiska(View v){
        Intent intent = new Intent(MainActivity.this, EachSkihill.class);
        intent.putExtra("title","Nakiska");

        startActivity(intent);

    }

    public void onClickMarmot(View v){
        Intent intent = new Intent(MainActivity.this, EachSkihill.class);
        intent.putExtra("title","Marmot");

        startActivity(intent);

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
