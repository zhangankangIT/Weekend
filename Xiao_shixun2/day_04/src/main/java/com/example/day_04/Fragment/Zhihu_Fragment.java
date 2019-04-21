package com.example.day_04.Fragment;


import com.example.day_04.Base.Base_fragment;
import com.example.day_04.Presenter_fragment.Zhihu_P;
import com.example.day_04.R;
import com.example.day_04.View_fragment.Zhihu_V;

public class Zhihu_Fragment extends Base_fragment <Zhihu_V,Zhihu_P> implements Zhihu_V{
    @Override
    protected Zhihu_P initPresenter() {
        return new Zhihu_P();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_zhihu_;
    }

}
