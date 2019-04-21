package com.example.day_04.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.day_04.Base.Base_fragment;
import com.example.day_04.Presenter_fragment.Collect_P;
import com.example.day_04.R;
import com.example.day_04.View_fragment.Collect_V;

/**
 * A simple {@link Fragment} subclass.
 */
public class Collect_Fragment extends Base_fragment<Collect_V,Collect_P>implements Collect_V {

    @Override
    protected Collect_P initPresenter() {
        return new Collect_P();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_collect_;
    }
}
