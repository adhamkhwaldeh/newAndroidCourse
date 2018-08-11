package com.course.testpro;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Adhamkh on 2018-08-02.
 */

public class MainActivity extends AppCompatActivity {

    Button button2;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_b);
//        button2 = (Button) findViewById(R.id.B1);
//        button2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //Toast.makeText(getBaseContext(), "Hello World",Toast.LENGTH_LONG).show();
//                //Intent xy =new Intent(getBaseContext(), secund.class);
//                //startActivity(xy);
//                Intent x=new Intent(getBaseContext(),flouer.class);
//
//            }
//        });



    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
