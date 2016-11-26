package com.example.lee.lakelouiseapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MakeReviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_review);
    }

    public void onClickSave(View v){ startActivity(new Intent(this, ReviewActivity.class)); }
    public void onClickCancel(View v){ startActivity(new Intent(this, MainActivity.class)); }
}
