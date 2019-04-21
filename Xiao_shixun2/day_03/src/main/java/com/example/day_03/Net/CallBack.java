package com.example.day_03.Net;

import com.example.day_03.Bean.LoginBean;

public interface CallBack {
    void onSuccess(LoginBean bean);
    void onFail(String msg);
}
