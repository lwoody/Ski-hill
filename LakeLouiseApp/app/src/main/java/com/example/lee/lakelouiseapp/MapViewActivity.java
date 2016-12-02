package com.example.lee.lakelouiseapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.widget.ImageView;

import uk.co.senab.photoview.PhotoViewAttacher;

public class MapViewActivity extends AppCompatActivity {

    ImageView m_imageView;
    PhotoViewAttacher mAttacher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_view);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int) (width),(int) (height*.4));

        m_imageView = (ImageView) findViewById(R.id.imageView5);
        mAttacher = new PhotoViewAttacher(m_imageView);
    }
}


