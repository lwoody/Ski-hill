package com.example.lee.skihillapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import uk.co.senab.photoview.PhotoViewAttacher;

public class OverviewActivity extends AppCompatActivity {

    ImageView m_imageView;
    PhotoViewAttacher mAttacher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overview);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //        shows the icon next to title
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        this.setTitle(title);

        m_imageView = (ImageView) findViewById(R.id.imageView3);
        mAttacher = new PhotoViewAttacher(m_imageView);


    }

}
