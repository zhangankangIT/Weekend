package com.example.day_03.Base;

import android.app.Application;
import android.support.v7.app.AppCompatDelegate;

public class Base_app extends Application {
    private static Base_app baseApp;
    public static int mMode= AppCompatDelegate.MODE_NIGHT_NO;

    @Override
    public void onCreate() {
        super.onCreate();
        baseApp=this;
    }
}
