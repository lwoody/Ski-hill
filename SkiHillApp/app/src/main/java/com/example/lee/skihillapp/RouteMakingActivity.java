package com.example.lee.skihillapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.view.View;
import android.widget.ViewSwitcher;
import android.view.ViewGroup;
import android.widget.ImageView;


public class RouteMakingActivity extends AppCompatActivity {

    int imageNo[]={R.drawable.lakelouise_overview_1,R.drawable.lakelouise_overview_2,R.drawable.lakelouise_overview_3,R.drawable.lakelouise_overview_4,R.drawable.lakelouise_overview_5};

    int countImage = imageNo.length;
    int currentImage = -1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route_making);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //        shows the icon next to title
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        this.setTitle(title);

        Button nextImage=(Button)findViewById(R.id.btnNext);
        final ImageSwitcher imageSwitcher = (ImageSwitcher) findViewById(R.id.imageChanger);

        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            public View makeView() {
                ImageView imageView = new ImageView(getApplicationContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setLayoutParams(new ImageSwitcher.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT));
                return imageView;

            }
        });

        nextImage.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                currentImage++;

                if(currentImage==countImage)
                    countImage=0;

                imageSwitcher.setImageResource(imageNo[currentImage]);

            }

        });
    }

}
