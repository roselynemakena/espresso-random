package com.example.makena.anew;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by makena on 16/06/17.
 */

public class CustomListAdapter extends ArrayAdapter<String> {

    private final Activity cont;
    private  final String[] name;
    private final Integer[] image;

    public CustomListAdapter(Activity cont1, String[] name1, Integer[] image1){

        super(cont1, R.layout.custom_list);

        this.cont = cont1;
        this.name = name1;
        this.image = image1;
    }

    public View getView(int pos, View view, ViewGroup vg){

        LayoutInflater layoutInflater = cont.getLayoutInflater();
        View rv = layoutInflater.inflate(R.layout.custom_list, null, true);

        TextView tv_fruit = (TextView) rv.findViewById(R.id.fruits_tv);
        ImageButton img = (ImageButton) rv.findViewById(R.id.fruit_icon);

        tv_fruit.setText(name[pos]);
        img.setImageResource(image[pos]);

        return  rv;

    }

}
