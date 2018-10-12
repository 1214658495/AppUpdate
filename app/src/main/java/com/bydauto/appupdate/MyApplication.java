package com.bydauto.appupdate;

import android.app.Application;

import com.tencent.bugly.Bugly;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Bugly.init(getApplicationContext(), "0c07b3a819", false);
    }
}
