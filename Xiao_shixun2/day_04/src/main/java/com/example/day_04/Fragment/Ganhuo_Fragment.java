package com.example.day_04.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.day_04.Base.Base_fragment;
import com.example.day_04.Presenter_fragment.Ganhuo_P;
import com.example.day_04.R;
import com.example.day_04.View_fragment.Ganhuo_V;

/**
 * A simple {@link Fragment} subclass.
 */
public class Ganhuo_Fragment extends Base_fragment<Ganhuo_V,Ganhuo_P>implements Ganhuo_V {


    @Override
    protected Ganhuo_P initPresenter() {
        return new Ganhuo_P();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_ganhuo_;
    }
}
