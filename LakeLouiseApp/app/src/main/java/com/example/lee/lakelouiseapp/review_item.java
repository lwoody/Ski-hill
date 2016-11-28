package com.example.lee.lakelouiseapp;

/**
 * Created by LEE on 2016. 11. 27..
 */

import android.graphics.drawable.Drawable;

public class review_item {
    private Drawable iconDrawable ;
    private String titleStr ;
    private String descStr ;
    private String timeStr ;

    public void setIcon(Drawable icon) {
        iconDrawable = icon ;
    }
    public void setTitle(String title) {
        titleStr = title ;
    }
    public void setDesc(String desc) {
        descStr = desc ;
    }
    public void setTime(String time) { timeStr = time ; }

    public Drawable getIcon() {
        return this.iconDrawable ;
    }
    public String getTitle() {
        return this.titleStr ;
    }
    public String getDesc() { return this.descStr ; }
    public String getTime() { return this.timeStr ; }

}