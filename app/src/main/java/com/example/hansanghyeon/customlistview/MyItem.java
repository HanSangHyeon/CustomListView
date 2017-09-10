package com.example.hansanghyeon.customlistview;

import android.graphics.drawable.Drawable;

public class MyItem {

    private Drawable icon;
    private String name;
    private String contents;

    public MyItem(Drawable icon, String name, String contents) {
        this.icon = icon;
        this.name = name;
        this.contents = contents;
    }

    public Drawable getIcon() {
        return icon;
    }

    public String getName() {
        return name;
    }

    public String getContents() {
        return contents;
    }
}
