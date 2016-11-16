package com.example.lee.skihillapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Boolean english = (Boolean) true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        shows the icon next to title
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

    }

    public void onClickLakeLouise(View v){
        Intent intent = new Intent(MainActivity.this, SkihillActivity.class);
        intent.putExtra("title","Lake Louise");

        startActivity(intent);

    }

    public void onClickNorquay(View v){
        Intent intent = new Intent(MainActivity.this, SkihillActivity.class);
        intent.putExtra("title","Norquay");

        startActivity(intent);

    }

    public void onClickSunshine(View v){
        Intent intent = new Intent(MainActivity.this, SkihillActivity.class);
        intent.putExtra("title","Sunshine Village");

        startActivity(intent);

    }

    public void onClickNakiska(View v){
        Intent intent = new Intent(MainActivity.this, SkihillActivity.class);
        intent.putExtra("title","Nakiska");

        startActivity(intent);

    }

    public void onClickMarmot(View v){
        Intent intent = new Intent(MainActivity.this, SkihillActivity.class);
        intent.putExtra("title","Marmot");

        startActivity(intent);

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch (item.getItemId()) {
            case R.id.buttonTranslate:
                AlertDialog.Builder builder = new AlertDialog.Builder(this);

                builder.setTitle("Language");
             // builder.setMessage("English / Korean");
                builder.setIcon(android.R.drawable.ic_dialog_alert);

                builder.setPositiveButton("Korean\t\t\t\t\t\t\t\t\t\t\t\t\t", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        setTitle("록키스키힐");
                        Button p1_button = (Button) findViewById(R.id.button8);
                        p1_button.setText("레이크 루이스");
                        Button p2_button = (Button) findViewById(R.id.button9);
                        p2_button.setText("나키스카");
                        Button p3_button = (Button) findViewById(R.id.button16);
                        p3_button.setText("말모트");
                        Button p4_button = (Button) findViewById(R.id.button10);
                        p4_button.setText("노르퀘이");
                        Button p5_button = (Button) findViewById(R.id.button11);
                        p5_button.setText("선샤인 빌리지");
                    }
                });
                builder.setNegativeButton("\t\t\t\t\t\t\t\t\t\t\tEnglish\t", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        setTitle("RockeyHills");
                        Button p1_button = (Button) findViewById(R.id.button8);
                        p1_button.setText("Lake Louise");
                        Button p2_button = (Button) findViewById(R.id.button9);
                        p2_button.setText("Nakiska");
                        Button p3_button = (Button) findViewById(R.id.button16);
                        p3_button.setText("Marmot");
                        Button p4_button = (Button) findViewById(R.id.button10);
                        p4_button.setText("Norquay");
                        Button p5_button = (Button) findViewById(R.id.button11);
                        p5_button.setText("Sunshine Village");
                    }

                });

                AlertDialog dialog = builder.create();
                dialog.show();

            default:
        // noinspection SimplifiableIfStatement
                return super.onOptionsItemSelected(item);
        }

    }
}
