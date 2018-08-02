package com.son.jawad.activitylifecycle.Widgets;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.son.jawad.activitylifecycle.R;
import com.son.jawad.activitylifecycle.Widgets.Views.CounterTextView;


/**
 * Created by Adhamkh on 2017-08-18.
 */
public class CustomActivity extends AppCompatActivity {
    CounterTextView counterTextView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_layout);
        counterTextView = (CounterTextView) findViewById(R.id.countertextview);
    }

    public void onClick(View view) {
        counterTextView.getstart(true);
    }
}
