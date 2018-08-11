package com.example.web.firstapp.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Spinner;

import com.example.web.firstapp.R;

/**
 * Created by web on 07/08/2018.
 */

public class OrientationActivity extends AppCompatActivity {

    Spinner spinner;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.res_layout);
        spinner = (Spinner) findViewById(R.id.spinner);

    }

}
