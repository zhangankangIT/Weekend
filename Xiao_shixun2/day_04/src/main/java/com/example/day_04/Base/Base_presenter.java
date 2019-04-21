package com.example.day_04.Base;

import java.util.ArrayList;

public abstract class Base_presenter<V extends Base_view> {
    protected V mView;
    protected ArrayList<Base_model>models=new ArrayList<>();
    public Base_presenter(){
        initModel();
    }
    protected abstract void initModel();

    public void bind(V view){
        this.mView=view;
    }
    public void onDestory() {
        //打断P层和V层的联系,
        mView = null;
        //掐断网络请求
        if (models.size()>0){
            for (Base_model model :models) {
                model.onDestory();
            }
            models.clear();
        }
    }

}
