package com.example.lee.lakelouiseapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.github.ksoichiro.android.observablescrollview.ObservableScrollView;
import com.github.ksoichiro.android.observablescrollview.ObservableScrollViewCallbacks;
import com.github.ksoichiro.android.observablescrollview.ScrollState;

import static com.example.lee.lakelouiseapp.R.drawable.logo_small_icon;

public class SelectLiftActivity extends AppCompatActivity implements ObservableScrollViewCallbacks {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_lift);
        this.setTitle("LIFT");

        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeAsUpIndicator(logo_small_icon);
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        ObservableScrollView scrollView = (ObservableScrollView) findViewById(R.id.lift_list);
        scrollView.setScrollViewCallbacks(this);


    }

    public void onClickGlacier(View v){

        Intent intent = new Intent(getApplicationContext(), SelectRouteActivity.class);
        startActivity(intent);
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
    public boolean onCreateOptionsMenu(Menu menu) {

        // 한 줄 코드
        getMenuInflater().inflate(R.menu.action_item, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        //ActionBar 메뉴 클릭에 대한 이벤트 처리
        String txt = null;
        int id = item.getItemId();
        switch (id){
            case android.R.id.home:
                Intent homeIntent = new Intent(this, MainActivity.class);
                homeIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(homeIntent);

            case R.id.item1:
                txt = "Item1 click";
                break;
//            case R.id.item2:
//                txt = "item2 click";
//                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
