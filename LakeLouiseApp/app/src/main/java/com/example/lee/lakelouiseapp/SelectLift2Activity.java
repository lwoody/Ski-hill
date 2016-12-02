package com.example.lee.lakelouiseapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.github.ksoichiro.android.observablescrollview.ObservableListView;
import com.github.ksoichiro.android.observablescrollview.ObservableScrollViewCallbacks;
import com.github.ksoichiro.android.observablescrollview.ScrollState;

import static com.example.lee.lakelouiseapp.R.drawable.logo_small_icon;
import static com.example.lee.lakelouiseapp.R.id.map_list;

public class SelectLift2Activity extends AppCompatActivity implements ObservableScrollViewCallbacks {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_lift2);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeAsUpIndicator(logo_small_icon);
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        this.setTitle("SELECT");

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.addTab(tabLayout.newTab().setText("LIFT"));
        tabLayout.addTab(tabLayout.newTab().setText("MAP"));

        View includeLiftContent = this.findViewById(R.id.content_lift);
        View includeMapContent = this.findViewById(R.id.content_map);

        final LinearLayout liftContent = (LinearLayout) includeLiftContent.findViewById(R.id.content_lift);
        final RelativeLayout mapContent = (RelativeLayout) includeMapContent.findViewById(R.id.content_map);

        liftContent.setVisibility(View.VISIBLE);
        mapContent.setVisibility(View.INVISIBLE);

        ObservableListView listView = (ObservableListView) liftContent.findViewById(R.id.lift_list);
        listView.setScrollViewCallbacks(this);

        ObservableListView mapListView = (ObservableListView) mapContent.findViewById(map_list);
        mapListView.setScrollViewCallbacks(this);

        final lift_adapter adapter;
        final map_adapter mapAdapter;

        // Adapter
        adapter = new lift_adapter() ;
        mapAdapter = new map_adapter();

        listView.setAdapter(adapter);
        mapListView.setAdapter(mapAdapter);


        // adding lift list item
        adapter.addItem(
                "Grizzly Express","intermediate", 0xff00ff00) ;
        adapter.addItem(
                "Glacier Express","beginner",0xffff0000) ;
        adapter.addItem(
                "Top of the world","expert",0xff00ff00) ;
        adapter.addItem(
                "Paradise","beginner",0xff00ff00) ;
        adapter.addItem(
                "Summit Platter","expert",0xff00ff00) ;
        adapter.addItem(
                "Larch Express","intermediate",0xff00ff00) ;

        // adding map list item
        mapAdapter.addItem(ContextCompat.getDrawable(this, R.drawable.lakelouise_overview3), "Overview");
        mapAdapter.addItem(ContextCompat.getDrawable(this, R.drawable.picture_icon),"Front Side & Larch");
        mapAdapter.addItem(ContextCompat.getDrawable(this, R.drawable.picture_icon), "Back Bowls");

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                if (position==0){
                    liftContent.setVisibility(View.VISIBLE);
                    mapContent.setVisibility(View.INVISIBLE);

                }
                else{
                    liftContent.setVisibility(View.INVISIBLE);
                    mapContent.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
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

    public void onClickSelectLift(View v){ startActivity(new Intent(this, SelectRouteActivity.class)); }

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

    public void onClickMap(View v){
        startActivity(new Intent(this,MapViewActivity.class));

    }

}
