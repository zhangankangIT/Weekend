package com.example.day_03.Base;

import java.util.ArrayList;

public abstract class Base_presenter <V extends Base_view>{
    protected V mvpView;
    protected ArrayList<Base_model>models=new ArrayList<>();

    public Base_presenter(){
        initModel();
    }
    protected abstract void initModel();

    public void bind(V mvpView) {
        this.mvpView = mvpView;
    }
    public void onDestory() {
        //打断P层和V层的联系,
        mvpView = null;
        //掐断网络请求
        if (models.size() > 0) {
            for (Base_model model : models) {
                model.onDestory();
            }
            models.clear();
        }
    }
}
