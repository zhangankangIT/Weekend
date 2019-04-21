package com.example.day_04.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.day_04.Base.Base_fragment;
import com.example.day_04.Presenter_fragment.V2ex_p;
import com.example.day_04.R;
import com.example.day_04.View_fragment.V2ex_V;
public class V2ex_Fragment extends Base_fragment<V2ex_V,V2ex_p>implements V2ex_V {

    @Override
    protected V2ex_p initPresenter() {
        return new V2ex_p();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_v2ex_;
    }

}
