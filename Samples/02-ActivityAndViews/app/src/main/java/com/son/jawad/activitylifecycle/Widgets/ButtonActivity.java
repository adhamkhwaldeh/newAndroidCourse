package com.son.jawad.activitylifecycle.Widgets;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.son.jawad.activitylifecycle.R;


/**
 * Created by Adhamkh on 2017-08-18.
 */

public class ButtonActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button_layout);
    }
}
