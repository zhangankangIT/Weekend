package com.example.day_03.MainP;

import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;

import com.example.day_03.Base.Base_presenter;
import com.example.day_03.Bean.LoginBean;
import com.example.day_03.MainModel.MainModel;
import com.example.day_03.MainView.MainView;
import com.example.day_03.Net.CallBack;

public class MainP extends Base_presenter<MainView> {

    private MainModel mainModel;

    @Override
    protected void initModel() {
        mainModel = new MainModel();

    }

    private static final String TAG = "MainP";
    public void login() {
        String pasd = mvpView.getPasd();
        String userName = mvpView.getUserName();
        if (TextUtils.isEmpty(userName) || TextUtils.isEmpty(pasd)) {
            mvpView.showToast("账号或密码不能为空");
            return;
        }
        mainModel.login(userName, pasd, new CallBack() {
            @Override
            public void onSuccess(LoginBean bean) {
                if (bean != null) {
                    Log.e(TAG, "onSuccess: "+bean.toString() );
                    if (bean.getCode() == 200) {
                        if (mvpView != null) {
                            mvpView.showToast("登录成功");
                        }
                    } else {
                        if (mvpView != null) {
                            mvpView.showToast("登录失败");
                        }
                    }
                }
            }

            @Override
            public void onFail(String msg) {
                if (mvpView != null) {
                    mvpView.showToast("登录失败");
                }
                Log.e(TAG, "onFail:========================== "+msg );
            }
        });
    }
}
