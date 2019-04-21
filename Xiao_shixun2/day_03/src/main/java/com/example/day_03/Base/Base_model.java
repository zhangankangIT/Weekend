package com.example.day_03.Base;

import io.reactivex.disposables.CompositeDisposable;

public class Base_model {
    protected CompositeDisposable mCompositeDisposable= new CompositeDisposable();
    public void onDestory(){
        mCompositeDisposable.clear();
    }
}
