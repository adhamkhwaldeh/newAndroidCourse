package com.example.web.firstapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.web.firstapp.R;

import java.util.List;

/**
 * Created by web on 07/08/2018.
 */

public class SpinnerAdapter extends BaseAdapter {
    Context context;
    List<String> names;

    public SpinnerAdapter(Context context, List<String> names) {
        this.context = context;
        this.names = names;
    }

    @Override
    public int getCount() {
        return names.size();
    }

    @Override
    public Object getItem(int position) {
        return names.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null)
            convertView = LayoutInflater.from(context).inflate(R.layout.spinner_item, parent, false);
        return convertView;
    }
}
