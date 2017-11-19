package com.example.rathana.layoutdemo;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import android.widget.TextView;

/**
 * Created by RATHANA on 11/19/2017.
 */

public class FrameActivity extends AppCompatActivity {

    private FrameLayout frame;
    private TextView text1,text2,text3;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.framelayout_layout);
        frame=findViewById(R.id.frame);
        text1=findViewById(R.id.text1);
        text2=findViewById(R.id.text2);
        text3=findViewById(R.id.text3);
    }
}
