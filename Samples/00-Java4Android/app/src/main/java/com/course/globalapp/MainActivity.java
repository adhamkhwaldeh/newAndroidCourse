package com.course.globalapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

/**
 * Created by Adhamkh on 2018-07-28.
 */

public class MainActivity extends AppCompatActivity {

    public Button firstBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        firstBtn = findViewById(R.id.firstBtn);

    }

}
