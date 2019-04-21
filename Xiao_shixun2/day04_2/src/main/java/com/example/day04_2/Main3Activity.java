package com.example.day04_2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.ImageView;
//create by 张安康
public class Main3Activity extends AppCompatActivity implements View.OnClickListener {

    private Button mXuan;
    private Button mJian;
    private Button mSuofang;
    private ImageView mImg1;
    private ImageView mImg2;
    private ImageView mImg3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        initView();
    }

    private void initView() {
        mXuan = (Button) findViewById(R.id.xuan);
        mXuan.setOnClickListener(this);
        mJian = (Button) findViewById(R.id.jian);
        mJian.setOnClickListener(this);
        mSuofang = (Button) findViewById(R.id.suofang);
        mSuofang.setOnClickListener(this);
        mImg1 = (ImageView) findViewById(R.id.img1);
        mImg2 = (ImageView) findViewById(R.id.img2);
        mImg3 = (ImageView) findViewById(R.id.img3);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.xuan:
                 RotateAnimation animation = new RotateAnimation(0, 360, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                         animation.setDuration(3000);
                         animation.setFillAfter(true);
                         mImg1.startAnimation(animation);
                break;
            case R.id.jian:
                AlphaAnimation alphaAnimation = new AlphaAnimation(1, 0);
                        alphaAnimation.setDuration(3000);
                        alphaAnimation.setFillAfter(true);
                        mImg2.startAnimation(alphaAnimation);
                break;
            case R.id.suofang:
                ScaleAnimation animation2 = new ScaleAnimation(0, 2, 0, 2, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                        animation2.setDuration(5000);
                        animation2.setFillAfter(false);
                        mImg3.startAnimation(animation2);
                break;
        }
    }
}
