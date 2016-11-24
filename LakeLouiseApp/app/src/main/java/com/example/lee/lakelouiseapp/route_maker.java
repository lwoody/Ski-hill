package com.example.lee.lakelouiseapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class route_maker extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route_maker);
    }

    public void glacierButton(View v)       {startActivity(new Intent(this, glacier_runs.class));}
}
