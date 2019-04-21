package com.example.day_04.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.day_04.Base.Base_fragment;
import com.example.day_04.Presenter_fragment.Shuju_P;
import com.example.day_04.R;
import com.example.day_04.View_fragment.Shuju_V;

/**
 * A simple {@link Fragment} subclass.
 */
public class Shuju_Fragment extends Base_fragment<Shuju_V,Shuju_P>implements Shuju_V{
    @Override
    protected Shuju_P initPresenter() {
        return new Shuju_P();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_shuju_;
    }

//create by 张安康

}
