package com.example.day_04.Base;

import io.reactivex.disposables.CompositeDisposable;

public class Base_model {
    protected CompositeDisposable mCompositeDisposable = new CompositeDisposable();
    public void onDestory() {
        //切换所有的Disposable对象
        mCompositeDisposable.clear();
    }
}
