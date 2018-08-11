package com.jawad.sons.picturesapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;

import com.bumptech.glide.Glide;
import com.bumptech.glide.module.GlideModule;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    SeekBar seekX;
    SeekBar seekY;
    ImageView sourceImage;
    Button applyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seekX = (SeekBar) findViewById(R.id.seekX);
        seekY = (SeekBar) findViewById(R.id.seekY);
        sourceImage = (ImageView) findViewById(R.id.sourceImage);
        applyButton = (Button) findViewById(R.id.applyBtn);

        startActivity(new Intent(this, SpinnerActivity.class));

        applyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer width = seekX.getProgress();
                Integer height = seekY.getProgress();
                LoadImageGlide(width, height);
            }
        });
    }


    public void LoadImage(Integer width, Integer height) {
        String url = "https://picsum.photos/" + width.toString() + "/" + height.toString() + "/?random";
        Picasso.with(this).load(url).placeholder(R.drawable.images).error(R.drawable.error).into(sourceImage);
    }

    public void LoadImageGlide(Integer width, Integer height) {
        String url = "https://picsum.photos/" + width.toString() + "/" + height.toString() + "/?random";
        Glide.with(this).load(url).into(sourceImage);
    }

}
