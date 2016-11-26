package com.example.lee.lakelouiseapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MakeReviewActivity extends AppCompatActivity {

    static long time = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_review);
        TextView timeView = (TextView)findViewById((R.id.timeView));
        int secs = ((int)(time / 1000));
        int mins = secs / 60;
        int milli = (int) (time%1000);
        timeView.setText(String.format("%2dm %2ds", mins, secs%60));
    }

    public void onClickSave(View v){ startActivity(new Intent(this, ReviewActivity.class)); }
    public void onClickCancel(View v){ startActivity(new Intent(this, MainActivity.class)); }

    static void getTime(long timeIn)
    {
        time = timeIn;
    };
}

