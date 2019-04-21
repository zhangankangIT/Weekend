package com.example.day_04.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.day_04.Base.Base_fragment;
import com.example.day_04.Presenter_fragment.About_P;
import com.example.day_04.R;
import com.example.day_04.View_fragment.About_V;

/**
 * A simple {@link Fragment} subclass.
 */
public class About_Fragment extends Base_fragment<About_V,About_P>implements About_V {


    @Override
    protected About_P initPresenter() {
        return new About_P();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_about_;
    }
}
