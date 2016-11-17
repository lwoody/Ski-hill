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
    public void grizzlyButton(View v)       {startActivity(new Intent(this, grizzly_runs.class));}
    public void topOfTheWorldButton(View v) {startActivity(new Intent(this, top_of_the_world_runs.class));}
    public void ptarmiganButton(View v)     {startActivity(new Intent(this, ptarmigan_runs.class));}
    public void larchButton(View v)         {startActivity(new Intent(this, larch_runs.class));}
    public void paradiseButton(View v)      {startActivity(new Intent(this, paradise_runs.class));}
    public void summitButton(View v)        {startActivity(new Intent(this, summit_runs.class));}
}
