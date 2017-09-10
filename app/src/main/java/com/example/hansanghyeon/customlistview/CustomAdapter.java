package com.example.hansanghyeon.customlistview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {

    private ArrayList<MyItem> list = new ArrayList<>();

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();

        if (view == null) {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.listview_item, viewGroup, false);
        }

        ImageView imageView = (ImageView) view.findViewById(R.id.iv_img);
        TextView textView1 = (TextView) view.findViewById(R.id.tv_name);
        TextView textView2 = (TextView) view.findViewById(R.id.tv_contents);

        MyItem myItem = (MyItem)getItem(i);
        imageView.setImageDrawable(myItem.getIcon());
        textView1.setText(myItem.getName());
        textView2.setText(myItem.getContents());


        return view;
    }

    public void addItem(Drawable img, String name, String contents) {

        MyItem mItem = new MyItem(img, name, contents);

        /* MyItem에 아이템을 setting한다. */


        /* mItems에 MyItem을 추가한다. */
        list.add(mItem);
    }
}
