package com.jawad.sons.picturesapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Spinner;

import com.jawad.sons.picturesapp.Adapters.SpinnerAdapter;

import java.util.List;
import java.util.Vector;

/**
 * Created by web on 8/9/2018.
 */

public class SpinnerActivity extends AppCompatActivity {
    Spinner spinner;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spinner_layout);
        spinner = (Spinner) findViewById(R.id.spinner);
        List<String> names = new Vector<>();
        names.add("mohamad");
        names.add("aws");
        names.add("ghadi");
        names.add("huzaifa");
        names.add("samer");
        names.add("zead");
        names.add("Adham khwaldeh");
        spinner.setAdapter(new SpinnerAdapter(this, names));

    }

}
