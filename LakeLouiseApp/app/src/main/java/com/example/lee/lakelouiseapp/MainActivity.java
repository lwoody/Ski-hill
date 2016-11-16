package com.example.lee.lakelouiseapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnMenuTabSelectedListener;

public class MainActivity extends AppCompatActivity {

    private CoordinatorLayout coordinatorLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        coordinatorLayout = (CoordinatorLayout) findViewById(R.id.activity_main);
        final RelativeLayout mainContent1 = (RelativeLayout) findViewById(R.id.MainContent1);
        final RelativeLayout mainContent2 = (RelativeLayout) findViewById(R.id.MainContent2);

        mainContent1.setVisibility(View.VISIBLE);
        mainContent2.setVisibility(View.GONE);

        BottomBar bottomBar = BottomBar.attach(this, savedInstanceState);
        bottomBar.setItemsFromMenu(R.menu.bottom_button, new OnMenuTabSelectedListener() {
            @Override
            public void onMenuItemSelected(int itemId) {
                switch (itemId) {
                    case R.id.route_item:
                        Snackbar.make(coordinatorLayout, "Routes Selected", Snackbar.LENGTH_LONG).show();
                        mainContent1.setVisibility(View.VISIBLE);
                        mainContent2.setVisibility(View.GONE);
                        break;
                    case R.id.info_item:
                        Snackbar.make(coordinatorLayout, "Infromation Selected", Snackbar.LENGTH_LONG).show();
                        mainContent1.setVisibility(View.GONE);
                        mainContent2.setVisibility(View.VISIBLE);
                        break;
                }
            }
        });

        // Set the color for the active tab. Ignored on mobile when there are more than three tabs.
        bottomBar.setActiveTabColor("#4259f4");

    }

    public void makeButton(View v){
        Intent intent = new Intent(getApplicationContext(), SelectLiftActivity.class);
        startActivity(intent);
    }


}
