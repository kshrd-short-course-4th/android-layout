package com.example.rathana.layoutdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by RATHANA on 11/19/2017.
 */

public class GridAdapter extends BaseAdapter {

    Context context;
    List<String> list;

    public GridAdapter(Context context ,List<String> list){
        this.context=context;
        this.list=list;
    }
    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(R.layout.grid_item_adapter_layout,
                parent,false);
        return view;
    }
}
