package com.shiv.customlv;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.shiv.customlv.R;

import static com.shiv.customlv.R.id.txt1;

public class Custom extends ArrayAdapter {
    Activity c;
    String[] s1;
    Integer[] img;
    public Custom(Context context, String[] resource, Integer[] textViewResourceId) {
        super(context, R.layout.activity_main,resource);
        c=(Activity)context;
        s1=resource;
        img=textViewResourceId;
    }
    @Override
    public View getView(int position,View convertView,ViewGroup parent) {
        LayoutInflater lf=c.getLayoutInflater();//Layout inflater is a class which use for include xml file.
        convertView=lf.inflate(R.layout.single,null);
        ImageView im=convertView.findViewById(R.id.img1);
        TextView tv=convertView.findViewById(R.id.txt1);
        im.setImageResource(img[position]);
        tv.setText(s1[position]);
        return  convertView;

    }
}
