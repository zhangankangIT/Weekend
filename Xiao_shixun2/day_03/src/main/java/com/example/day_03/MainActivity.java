package com.example.day_03;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.day_03.Base.Base_activity;
import com.example.day_03.MainP.MainP;
import com.example.day_03.MainView.MainView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends Base_activity<MainView, MainP> implements MainView {
    @BindView(R.id.name)
    EditText mName;
    @BindView(R.id.psw)
    EditText mPsw;
    @BindView(R.id.bv)
    Button mBv;
    //create by 张安康

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected MainP initPresenter() {
        return new MainP();
    }

    @OnClick({R.id.bv})
    public void click(View v) {
        mPresenter.login();
    }

    @Override
    public String getUserName() {
        return mName.getText().toString().trim();
    }

    @Override
    public String getPasd() {
        return mPsw.getText().toString().trim();
    }

    @Override
    public void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }



}
