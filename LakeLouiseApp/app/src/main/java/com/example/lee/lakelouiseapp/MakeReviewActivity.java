package com.example.lee.lakelouiseapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class MakeReviewActivity extends AppCompatActivity {

    static long time = 0;
    RatingBar ratingBar;
    EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_review);
        TextView timeView = (TextView)findViewById((R.id.timeView));
        int secs = ((int)(time / 1000));
        int mins = secs / 60;
        timeView.setText(String.format("%2dm %2ds", mins, secs%60));

        ratingBar = (RatingBar)findViewById(R.id.reviewRatingBar);
        text = (EditText)findViewById(R.id.reviewText);
    }

    public void saveButton(View v)
    {
        System.out.println("click");
        saveReview();
        //startActivity(new Intent(this, ReviewActivity.class));
    }
    public void onClickCancel(View v){ startActivity(new Intent(this, MainActivity.class)); }

    static void getTime(long timeIn)
    {
        time = timeIn;
    }

    void saveReview()
    {
        /*try
        {
            System.out.println("tried");
            File file = new File("reviews.txt");

            if (file.createNewFile())
                System.out.println("created");
            else
                System.out.println("not created");
            file.setWritable(true);
            System.out.println(file.getAbsolutePath());

            byte[] rev = (time + " " + ratingBar.getNumStars() + " \"" + text.getText() + "\"").getBytes();


            FileInputStream in = new FileInputStream(file);
            byte[] data = new byte[(int) file.length()];
            in.read(data);
            in.close();

            FileOutputStream out = new FileOutputStream(file);
            out.write(rev);
            out.write(data);
            out.close();

        }
        catch (IOException e)
        {
            System.out.println(e);
        }*/
    }
}

