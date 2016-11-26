package com.example.lee.lakelouiseapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SelectLiftActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_lift);
    }

    public void onClickGlacier(View v){

        Intent intent = new Intent(getApplicationContext(), SelectRouteActivity.class);
        startActivity(intent);
    }
}
