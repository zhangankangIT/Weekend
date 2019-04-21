package com.example.day_04.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.day_04.Base.Base_fragment;
import com.example.day_04.Presenter_fragment.Set_P;
import com.example.day_04.R;
import com.example.day_04.View_fragment.Set_V;

/**
 * A simple {@link Fragment} subclass.
 */
public class Set_Fragment extends Base_fragment<Set_V,Set_P> implements Set_V {


    @Override
    protected Set_P initPresenter() {
        return new Set_P();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_set_;
    }
}
