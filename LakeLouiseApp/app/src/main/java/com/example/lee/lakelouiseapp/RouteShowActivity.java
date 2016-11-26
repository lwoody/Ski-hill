package com.example.lee.lakelouiseapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;

public class RouteShowActivity extends AppCompatActivity{

    Button startButton, stopButton;
    TextView timerView;
    Handler handler = new Handler();
    long startTime=0, milliTime=0, timeSwapBuff=0, updateTime=0;

    Runnable updateTimerThread = new Runnable() {
        @Override
        public void run() {
            milliTime = SystemClock.uptimeMillis()-startTime;
            updateTime = timeSwapBuff+milliTime;
            int secs = (int)(updateTime / 1000);
            int mins = secs / 60;
            int milli = (int) (updateTime%1000);
            if (mins > 0)
                timerView.setText("" + mins + ":" + String.format("%2d", secs) + ":" + String.format("%3d", milli));
            else
                timerView.setText(String.format("%2d", secs) + ":" + String.format("%3d", milli));

            handler.postDelayed(this, 0);
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route_show);

        startButton = (Button)findViewById(R.id.startButton);
        stopButton = (Button)findViewById(R.id.stopButton);
        timerView = (TextView)findViewById(R.id.timer);

        startButton.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startTime = SystemClock.uptimeMillis();
                handler.postDelayed(updateTimerThread, 0);
            }
        });
        stopButton.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                timeSwapBuff+=milliTime;
                handler.removeCallbacks(updateTimerThread);
            }
        });
    }
    public void onClickSave(View v){ startActivity(new Intent(this, MakeReviewActivity.class)); }
}
