package com.example.day_04.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.day_04.Base.Base_fragment;
import com.example.day_04.Presenter_fragment.WeiChat_P;
import com.example.day_04.R;
import com.example.day_04.View_fragment.WeiChat_V;

/**
 * A simple {@link Fragment} subclass.
 */
public class WeiChart_Fragment extends Base_fragment<WeiChat_V,WeiChat_P>implements WeiChat_V {


    @Override
    protected WeiChat_P initPresenter() {
        return new WeiChat_P();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_wei_chart_;
    }

}
