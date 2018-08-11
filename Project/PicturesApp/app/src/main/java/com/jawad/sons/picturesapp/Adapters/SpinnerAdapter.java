package com.jawad.sons.picturesapp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.jawad.sons.picturesapp.R;

import java.util.List;

/**
 * Created by web on 8/9/2018.
 */

public class SpinnerAdapter extends BaseAdapter {
    public Context context;
    public List<String> stringList;

    public SpinnerAdapter(Context context, List<String> stringList) {
        this.context = context;
        this.stringList = stringList;
    }

    @Override
    public int getCount() {
        return stringList.size();
    }

    @Override
    public Object getItem(int position) {
        return stringList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        if (convertView == null)
            convertView = LayoutInflater.from(context).inflate(R.layout.spinner_item, parent, false);

        TextView nameText = convertView.findViewById(R.id.nameText);
        nameText.setText(stringList.get(position));

        ImageView deleteBtn = convertView.findViewById(R.id.deleteBtn);
        deleteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stringList.remove(position);
                notifyDataSetChanged();
            }
        });
        return convertView;
    }

}
