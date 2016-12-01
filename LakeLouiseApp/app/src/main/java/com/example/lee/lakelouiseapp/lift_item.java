package com.example.lee.lakelouiseapp;

import android.graphics.drawable.Drawable;

/**
 * Created by LEE on 2016. 12. 1..
 */

public class lift_item {

    private Drawable iconDrawable ;
    private String titleStr ;
    private String descStr ;
    private String timeStr ;
    private String buttontitle;

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
    public void setButton(String lift_button){ buttontitle = lift_button;}

    public Drawable getIcon() {
        return this.iconDrawable ;
    }
    public String getTitle() {
        return this.titleStr ;
    }
    public String getDesc() { return this.descStr ; }
    public String getTime() { return this.timeStr ; }
    public String getButtonTitle() {return this.buttontitle;}
}
