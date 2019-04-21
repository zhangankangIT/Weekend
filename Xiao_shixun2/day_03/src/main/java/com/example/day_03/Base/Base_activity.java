package com.example.day_03.Base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

public abstract class Base_activity <V extends Base_view,P extends Base_presenter>extends AppCompatActivity
{
    protected P mPresenter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        ButterKnife.bind(this);
        mPresenter=initPresenter();
        if (mPresenter!=null){
            mPresenter.bind((V)this);
        }
        initView();
        initListener();
        initData();
    }

    private void initData() {

    }

    private void initView() {

    }

    private void initListener() {

    }

    protected abstract int getLayoutId() ;

    protected abstract P initPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.onDestory();
        mPresenter=null;
    }
}
