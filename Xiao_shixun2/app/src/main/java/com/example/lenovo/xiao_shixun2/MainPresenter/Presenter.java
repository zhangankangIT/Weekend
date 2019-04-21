package com.example.lenovo.xiao_shixun2.MainPresenter;

import com.example.lenovo.xiao_shixun2.Base.BaseMvpView;
import com.example.lenovo.xiao_shixun2.Base.Base_presenter;
import com.example.lenovo.xiao_shixun2.MainView.MainV;

public class Presenter extends Base_presenter<MainV> {

   public void getData(){
       String data="请求回来的数据";
       if(mMvpView!=null){
           mMvpView.setData(data);
       }
   }
}
