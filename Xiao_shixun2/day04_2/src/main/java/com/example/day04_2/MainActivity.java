package com.example.day04_2;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView mImg;
    private Button mBv;
    private AnimationDrawable animation;
    /**
     * 结束
     */
    private Button mBv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        animation = (AnimationDrawable) mImg.getBackground();
        animation.start();
    }
    private void initView() {
        mImg = (ImageView) findViewById(R.id.img);

    }


}
