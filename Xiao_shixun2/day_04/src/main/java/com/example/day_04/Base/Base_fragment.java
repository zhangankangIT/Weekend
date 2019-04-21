package com.example.day_04.Base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class Base_fragment <V extends Base_view,P extends Base_presenter> extends Fragment implements Base_view  {
    private Unbinder unbinder;
    private P mPresenter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(getLayoutId(), null);
        unbinder = ButterKnife.bind(this, inflate);
        mPresenter = initPresenter();
        if (mPresenter !=null){
            mPresenter.bind(this);
        }
        initView();
        initListener();

        initData();

        return inflate;
    }

    protected void initData() {

    }

    protected void initListener() {
    }

    protected void initView() {
    }
    protected abstract P initPresenter();
    protected abstract int getLayoutId();

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
        mPresenter.onDestory();
        mPresenter=null;
    }
}

