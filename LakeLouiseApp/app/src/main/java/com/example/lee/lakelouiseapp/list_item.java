package com.example.lee.lakelouiseapp;

/**
 * Created by LEE on 2016. 11. 27..
 */

import android.graphics.drawable.Drawable;

public class list_item {
    private Drawable iconDrawable ;
    private String titleStr ;
    private String descStr ;
    private String timeStr ;
    private String buttontitle;
    private Integer color1;
    private Integer color2;
    private Integer color3;
    private Integer color4;
    private Integer statusColor;
    private Boolean status;

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
    public void setColor1(Integer background_color){ color1 = background_color; }
    public void setColor2(Integer background_color){ color2 = background_color; }
    public void setColor3(Integer background_color){ color3 = background_color; }
    public void setColor4(Integer background_color){ color4 = background_color; }
    public void setStatusColor(Integer background_color){ statusColor = background_color; }
    public void setStatus(Boolean lift_status){ status = lift_status;}

    public Drawable getIcon() {
        return this.iconDrawable ;
    }
    public String getTitle() {
        return this.titleStr ;
    }
    public String getDesc() { return this.descStr ; }
    public String getTime() { return this.timeStr ; }
    public String getButtonTitle() {return this.buttontitle;}
    public Integer getColor1(){ return this.color1;}
    public Integer getColor2(){ return this.color2;}
    public Integer getColor3(){ return this.color3;}
    public Integer getColor4(){ return this.color4;}
    public Integer getStatusColor(){ return this.statusColor;}
    public Boolean getStatus(){ return this.status;}

}