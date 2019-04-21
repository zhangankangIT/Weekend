package com.example.day04_2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.BounceInterpolator;
import android.view.animation.CycleInterpolator;
import android.widget.Button;
import android.widget.ImageView;

import com.nineoldandroids.view.ViewPropertyAnimator;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    /**
     * 属性动画
     */
    private Button mBv;
    private ImageView mImg;
    /**
     * 属性动画2
     */
    private Button mBv1;
    private ImageView mImg1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initView();
    }

    private void initView() {
        mBv = (Button) findViewById(R.id.bv);
        mBv.setOnClickListener(this);
        mImg = (ImageView) findViewById(R.id.img);
        mBv1 = (Button) findViewById(R.id.bv1);
        mBv1.setOnClickListener(this);
        mImg1 = (ImageView) findViewById(R.id.img1);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.bv:
                ViewPropertyAnimator
                        .animate(mImg)
                        .translationY(600)
                        .setInterpolator(new BounceInterpolator())
                        .setDuration(1500)
                        .start();
                break;
            case R.id.bv1:
                ViewPropertyAnimator
                        .animate(mImg1)
                        .translationX(40)
                        .setInterpolator(new CycleInterpolator(6))
                        .setDuration(1500)
                        .start();
                break;
        }
    }
}
