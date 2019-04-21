package com.example.lenovo.xiao_shixun2.Base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

public abstract class Base_activity<V extends BaseMvpView,P extends Base_presenter> extends AppCompatActivity implements BaseMvpView{
    protected P mPresenter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        ButterKnife.bind(this);
        initView();
        initListener();
        initData();
    }

    private void initData() {

    }

    private void initListener() {

    }

    private void initView() {

    }

    protected abstract int getLayoutId() ;
}
