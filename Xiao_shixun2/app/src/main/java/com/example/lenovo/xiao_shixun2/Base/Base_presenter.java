package com.example.lenovo.xiao_shixun2.Base;

public abstract class Base_presenter<V extends BaseMvpView> {
    protected V mMvpView;

    public void setmMvpView(V mMvpView) {
        this.mMvpView = mMvpView;
    }

}
