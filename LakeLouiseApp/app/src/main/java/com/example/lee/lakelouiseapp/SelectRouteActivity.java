package com.example.lee.lakelouiseapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;

import com.github.ksoichiro.android.observablescrollview.ObservableScrollView;
import com.github.ksoichiro.android.observablescrollview.ObservableScrollViewCallbacks;
import com.github.ksoichiro.android.observablescrollview.ScrollState;

import static com.example.lee.lakelouiseapp.R.drawable.logo_small_icon;
import static com.example.lee.lakelouiseapp.R.drawable.xml_button;
import static com.example.lee.lakelouiseapp.R.drawable.xml_button_disabled;

public class SelectRouteActivity extends AppCompatActivity implements ObservableScrollViewCallbacks{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_route);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeAsUpIndicator(logo_small_icon);
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        this.setTitle("ROUTE");

        ObservableScrollView scrollView = (ObservableScrollView) findViewById(R.id.scroll_route);
        scrollView.setScrollViewCallbacks(this);

        final CheckBox checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
        final CheckBox checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        final CheckBox checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
        final CheckBox checkBox4 = (CheckBox) findViewById(R.id.checkBox4);
        final CheckBox checkBox5 = (CheckBox) findViewById(R.id.checkBox5);
        final CheckBox checkBox6 = (CheckBox) findViewById(R.id.checkBox6);
        final CheckBox checkBox7 = (CheckBox) findViewById(R.id.checkBox7);
        final CheckBox checkBox8 = (CheckBox) findViewById(R.id.checkBox8);
        final CheckBox checkBox9 = (CheckBox) findViewById(R.id.checkBox9);
        final CheckBox checkBox10 = (CheckBox) findViewById(R.id.checkBox10);
        final CheckBox checkBox11 = (CheckBox) findViewById(R.id.checkBox11);

        checkBox1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if ( ((CheckBox)v).isChecked() ){
                    checkBox2.setEnabled(false);
                    checkBox2.setButtonDrawable(xml_button_disabled);
                    checkBox3.setEnabled(false);
                    checkBox3.setButtonDrawable(xml_button_disabled);
                    checkBox4.setEnabled(false);
                    checkBox4.setButtonDrawable(xml_button_disabled);
                    checkBox6.setEnabled(false);
                    checkBox6.setButtonDrawable(xml_button_disabled);
                    checkBox7.setEnabled(false);
                    checkBox7.setButtonDrawable(xml_button_disabled);
                    checkBox9.setEnabled(false);
                    checkBox9.setButtonDrawable(xml_button_disabled);
                    checkBox10.setEnabled(false);
                    checkBox10.setButtonDrawable(xml_button_disabled);
                }
                else{
                    checkBox2.setEnabled(true);
                    checkBox2.setButtonDrawable(xml_button);
                    checkBox3.setEnabled(true);
                    checkBox3.setButtonDrawable(xml_button);
                    checkBox4.setEnabled(true);
                    checkBox4.setButtonDrawable(xml_button);
                    checkBox6.setEnabled(true);
                    checkBox6.setButtonDrawable(xml_button);
                    checkBox7.setEnabled(true);
                    checkBox7.setButtonDrawable(xml_button);
                    checkBox9.setEnabled(true);
                    checkBox9.setButtonDrawable(xml_button);
                    checkBox10.setEnabled(true);
                    checkBox10.setButtonDrawable(xml_button);
                }
            }
        });

        checkBox2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if ( ((CheckBox)v).isChecked() ){
                    checkBox1.setEnabled(false);
                    checkBox1.setButtonDrawable(xml_button_disabled);
                    checkBox5.setEnabled(false);
                    checkBox5.setButtonDrawable(xml_button_disabled);
                    checkBox8.setEnabled(false);
                    checkBox8.setButtonDrawable(xml_button_disabled);
                }
                else{
                    checkBox1.setEnabled(true);
                    checkBox1.setButtonDrawable(xml_button);
                    checkBox5.setEnabled(true);
                    checkBox5.setButtonDrawable(xml_button);
                    checkBox8.setEnabled(true);
                    checkBox8.setButtonDrawable(xml_button);
                }
            }
        });

        checkBox3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if ( ((CheckBox)v).isChecked() ){
                    checkBox1.setEnabled(false);
                    checkBox1.setButtonDrawable(xml_button_disabled);
                    checkBox5.setEnabled(false);
                    checkBox5.setButtonDrawable(xml_button_disabled);
                    checkBox4.setEnabled(false);
                    checkBox4.setButtonDrawable(xml_button_disabled);
                    checkBox6.setEnabled(false);
                    checkBox6.setButtonDrawable(xml_button_disabled);
                    checkBox8.setEnabled(false);
                    checkBox8.setButtonDrawable(xml_button_disabled);
                    checkBox11.setEnabled(false);
                    checkBox11.setButtonDrawable(xml_button_disabled);

                }
                else{
                    checkBox1.setEnabled(true);
                    checkBox1.setButtonDrawable(xml_button);
                    checkBox5.setEnabled(true);
                    checkBox5.setButtonDrawable(xml_button);
                    checkBox4.setEnabled(true);
                    checkBox4.setButtonDrawable(xml_button);
                    checkBox6.setEnabled(true);
                    checkBox6.setButtonDrawable(xml_button);
                    checkBox8.setEnabled(true);
                    checkBox8.setButtonDrawable(xml_button);
                    checkBox11.setEnabled(true);
                    checkBox11.setButtonDrawable(xml_button);
                }
            }
        });

        checkBox4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if ( ((CheckBox)v).isChecked() ){
                    checkBox1.setEnabled(false);
                    checkBox1.setButtonDrawable(xml_button_disabled);
                    checkBox3.setEnabled(false);
                    checkBox3.setButtonDrawable(xml_button_disabled);
                    checkBox5.setEnabled(false);
                    checkBox5.setButtonDrawable(xml_button_disabled);
                    checkBox6.setEnabled(false);
                    checkBox6.setButtonDrawable(xml_button_disabled);
                    checkBox7.setEnabled(false);
                    checkBox7.setButtonDrawable(xml_button_disabled);
                    checkBox8.setEnabled(false);
                    checkBox8.setButtonDrawable(xml_button_disabled);
                    checkBox9.setEnabled(false);
                    checkBox9.setButtonDrawable(xml_button_disabled);
                    checkBox10.setEnabled(false);
                    checkBox10.setButtonDrawable(xml_button_disabled);
                }
                else{
                    checkBox1.setEnabled(true);
                    checkBox1.setButtonDrawable(xml_button);
                    checkBox3.setEnabled(true);
                    checkBox3.setButtonDrawable(xml_button);
                    checkBox5.setEnabled(true);
                    checkBox5.setButtonDrawable(xml_button);
                    checkBox6.setEnabled(true);
                    checkBox6.setButtonDrawable(xml_button);
                    checkBox7.setEnabled(true);
                    checkBox7.setButtonDrawable(xml_button);
                    checkBox8.setEnabled(true);
                    checkBox8.setButtonDrawable(xml_button);
                    checkBox9.setEnabled(true);
                    checkBox9.setButtonDrawable(xml_button);
                    checkBox10.setEnabled(true);
                    checkBox10.setButtonDrawable(xml_button);
                }
            }
        });

        checkBox5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if ( ((CheckBox)v).isChecked() ){
                    checkBox2.setEnabled(false);
                    checkBox2.setButtonDrawable(xml_button_disabled);
                    checkBox3.setEnabled(false);
                    checkBox3.setButtonDrawable(xml_button_disabled);
                    checkBox4.setEnabled(false);
                    checkBox4.setButtonDrawable(xml_button_disabled);
                    checkBox6.setEnabled(false);
                    checkBox6.setButtonDrawable(xml_button_disabled);
                    checkBox7.setEnabled(false);
                    checkBox7.setButtonDrawable(xml_button_disabled);
                    checkBox9.setEnabled(false);
                    checkBox9.setButtonDrawable(xml_button_disabled);
                    checkBox10.setEnabled(false);
                    checkBox10.setButtonDrawable(xml_button_disabled);
                }
                else{
                    checkBox2.setEnabled(true);
                    checkBox2.setButtonDrawable(xml_button);
                    checkBox3.setEnabled(true);
                    checkBox3.setButtonDrawable(xml_button);
                    checkBox4.setEnabled(true);
                    checkBox4.setButtonDrawable(xml_button);
                    checkBox6.setEnabled(true);
                    checkBox6.setButtonDrawable(xml_button);
                    checkBox7.setEnabled(true);
                    checkBox7.setButtonDrawable(xml_button);
                    checkBox9.setEnabled(true);
                    checkBox9.setButtonDrawable(xml_button);
                    checkBox10.setEnabled(true);
                    checkBox10.setButtonDrawable(xml_button);
                }
            }
        });

        checkBox6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if ( ((CheckBox)v).isChecked() ){
                    checkBox1.setEnabled(false);
                    checkBox1.setButtonDrawable(xml_button_disabled);
                    checkBox3.setEnabled(false);
                    checkBox3.setButtonDrawable(xml_button_disabled);
                    checkBox4.setEnabled(false);
                    checkBox4.setButtonDrawable(xml_button_disabled);
                    checkBox5.setEnabled(false);
                    checkBox5.setButtonDrawable(xml_button_disabled);
                    checkBox7.setEnabled(false);
                    checkBox7.setButtonDrawable(xml_button_disabled);
                    checkBox8.setEnabled(false);
                    checkBox8.setButtonDrawable(xml_button_disabled);
                    checkBox9.setEnabled(false);
                    checkBox9.setButtonDrawable(xml_button_disabled);
                    checkBox10.setEnabled(false);
                    checkBox10.setButtonDrawable(xml_button_disabled);
                }
                else{
                    checkBox1.setEnabled(true);
                    checkBox1.setButtonDrawable(xml_button);
                    checkBox3.setEnabled(true);
                    checkBox3.setButtonDrawable(xml_button);
                    checkBox4.setEnabled(true);
                    checkBox4.setButtonDrawable(xml_button);
                    checkBox5.setEnabled(true);
                    checkBox5.setButtonDrawable(xml_button);
                    checkBox7.setEnabled(true);
                    checkBox7.setButtonDrawable(xml_button);
                    checkBox8.setEnabled(true);
                    checkBox8.setButtonDrawable(xml_button);
                    checkBox9.setEnabled(true);
                    checkBox9.setButtonDrawable(xml_button);
                    checkBox10.setEnabled(true);
                    checkBox10.setButtonDrawable(xml_button);
                }
            }
        });

        checkBox7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if ( ((CheckBox)v).isChecked() ){
                    checkBox1.setEnabled(false);
                    checkBox1.setButtonDrawable(xml_button_disabled);
                    checkBox5.setEnabled(false);
                    checkBox5.setButtonDrawable(xml_button_disabled);
                    checkBox4.setEnabled(false);
                    checkBox4.setButtonDrawable(xml_button_disabled);
                    checkBox6.setEnabled(false);
                    checkBox6.setButtonDrawable(xml_button_disabled);
                    checkBox8.setEnabled(false);
                    checkBox8.setButtonDrawable(xml_button_disabled);
                    checkBox11.setEnabled(false);
                    checkBox11.setButtonDrawable(xml_button_disabled);

                }
                else{
                    checkBox1.setEnabled(true);
                    checkBox1.setButtonDrawable(xml_button);
                    checkBox5.setEnabled(true);
                    checkBox5.setButtonDrawable(xml_button);
                    checkBox4.setEnabled(true);
                    checkBox4.setButtonDrawable(xml_button);
                    checkBox6.setEnabled(true);
                    checkBox6.setButtonDrawable(xml_button);
                    checkBox8.setEnabled(true);
                    checkBox8.setButtonDrawable(xml_button);
                    checkBox11.setEnabled(true);
                    checkBox11.setButtonDrawable(xml_button);
                }
            }
        });

        checkBox8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if ( ((CheckBox)v).isChecked() ){
                    checkBox2.setEnabled(false);
                    checkBox2.setButtonDrawable(xml_button_disabled);
                    checkBox3.setEnabled(false);
                    checkBox3.setButtonDrawable(xml_button_disabled);
                    checkBox4.setEnabled(false);
                    checkBox4.setButtonDrawable(xml_button_disabled);
                    checkBox6.setEnabled(false);
                    checkBox6.setButtonDrawable(xml_button_disabled);
                    checkBox7.setEnabled(false);
                    checkBox7.setButtonDrawable(xml_button_disabled);
                    checkBox9.setEnabled(false);
                    checkBox9.setButtonDrawable(xml_button_disabled);
                    checkBox10.setEnabled(false);
                    checkBox10.setButtonDrawable(xml_button_disabled);
                }
                else{
                    checkBox2.setEnabled(true);
                    checkBox2.setButtonDrawable(xml_button);
                    checkBox3.setEnabled(true);
                    checkBox3.setButtonDrawable(xml_button);
                    checkBox4.setEnabled(true);
                    checkBox4.setButtonDrawable(xml_button);
                    checkBox6.setEnabled(true);
                    checkBox6.setButtonDrawable(xml_button);
                    checkBox7.setEnabled(true);
                    checkBox7.setButtonDrawable(xml_button);
                    checkBox9.setEnabled(true);
                    checkBox9.setButtonDrawable(xml_button);
                    checkBox10.setEnabled(true);
                    checkBox10.setButtonDrawable(xml_button);
                }
            }
        });

        checkBox9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if ( ((CheckBox)v).isChecked() ){
                    checkBox1.setEnabled(false);
                    checkBox1.setButtonDrawable(xml_button_disabled);
                    checkBox5.setEnabled(false);
                    checkBox5.setButtonDrawable(xml_button_disabled);
                    checkBox4.setEnabled(false);
                    checkBox4.setButtonDrawable(xml_button_disabled);
                    checkBox6.setEnabled(false);
                    checkBox6.setButtonDrawable(xml_button_disabled);
                    checkBox8.setEnabled(false);
                    checkBox8.setButtonDrawable(xml_button_disabled);
                    checkBox11.setEnabled(false);
                    checkBox11.setButtonDrawable(xml_button_disabled);

                }
                else{
                    checkBox1.setEnabled(true);
                    checkBox1.setButtonDrawable(xml_button);
                    checkBox5.setEnabled(true);
                    checkBox5.setButtonDrawable(xml_button);
                    checkBox4.setEnabled(true);
                    checkBox4.setButtonDrawable(xml_button);
                    checkBox6.setEnabled(true);
                    checkBox6.setButtonDrawable(xml_button);
                    checkBox8.setEnabled(true);
                    checkBox8.setButtonDrawable(xml_button);
                    checkBox11.setEnabled(true);
                    checkBox11.setButtonDrawable(xml_button);
                }
            }
        });

        checkBox10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if ( ((CheckBox)v).isChecked() ){
                    checkBox1.setEnabled(false);
                    checkBox1.setButtonDrawable(xml_button_disabled);
                    checkBox5.setEnabled(false);
                    checkBox5.setButtonDrawable(xml_button_disabled);
                    checkBox4.setEnabled(false);
                    checkBox4.setButtonDrawable(xml_button_disabled);
                    checkBox6.setEnabled(false);
                    checkBox6.setButtonDrawable(xml_button_disabled);
                    checkBox8.setEnabled(false);
                    checkBox8.setButtonDrawable(xml_button_disabled);
                    checkBox11.setEnabled(false);
                    checkBox11.setButtonDrawable(xml_button_disabled);

                }
                else{
                    checkBox1.setEnabled(true);
                    checkBox1.setButtonDrawable(xml_button);
                    checkBox5.setEnabled(true);
                    checkBox5.setButtonDrawable(xml_button);
                    checkBox4.setEnabled(true);
                    checkBox4.setButtonDrawable(xml_button);
                    checkBox6.setEnabled(true);
                    checkBox6.setButtonDrawable(xml_button);
                    checkBox8.setEnabled(true);
                    checkBox8.setButtonDrawable(xml_button);
                    checkBox11.setEnabled(true);
                    checkBox11.setButtonDrawable(xml_button);
                }
            }
        });

        checkBox11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if ( ((CheckBox)v).isChecked() ){
                    checkBox10.setEnabled(false);
                    checkBox10.setButtonDrawable(xml_button_disabled);
                    checkBox9.setEnabled(false);
                    checkBox9.setButtonDrawable(xml_button_disabled);
                    checkBox7.setEnabled(false);
                    checkBox7.setButtonDrawable(xml_button_disabled);
                    checkBox3.setEnabled(false);
                    checkBox3.setButtonDrawable(xml_button_disabled);
                }
                else{
                    checkBox10.setEnabled(true);
                    checkBox10.setButtonDrawable(xml_button);
                    checkBox9.setEnabled(true);
                    checkBox9.setButtonDrawable(xml_button);
                    checkBox7.setEnabled(true);
                    checkBox7.setButtonDrawable(xml_button);
                    checkBox3.setEnabled(true);
                    checkBox3.setButtonDrawable(xml_button);
                }
            }
        });


    }

    public void onClickSubmit(View v){
        startActivity(new Intent(this, RouteShowActivity.class));
    }

    @Override
    public void onScrollChanged(int scrollY, boolean firstScroll,
                                boolean dragging) {
    }

    @Override
    public void onDownMotionEvent() {
    }

    @Override
    public void onUpOrCancelMotionEvent(ScrollState scrollState) {
        ActionBar ab = getSupportActionBar();
        if (scrollState == ScrollState.UP) {
            if (ab.isShowing()) {
                ab.hide();
            }
        } else if (scrollState == ScrollState.DOWN) {
            if (!ab.isShowing()) {
                ab.show();
            }
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case android.R.id.home:
                Intent homeIntent = new Intent(this, MainActivity.class);
                homeIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(homeIntent);
        }
        return (super.onOptionsItemSelected(menuItem));
    }

}
