package com.example.day_03.MainView;

import com.example.day_03.Base.Base_view;

public interface MainView extends Base_view{
    String getUserName();
    String getPasd();
    void showToast(String msg);
}
