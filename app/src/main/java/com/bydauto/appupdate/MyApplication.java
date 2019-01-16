package com.bydauto.appupdate;

import android.app.Application;
import android.util.Log;

import com.tencent.bugly.Bugly;

public class MyApplication extends Application {
    private static final String TAG = "MyApplication";
    @Override
    public void onCreate() {
        super.onCreate();
        Bugly.init(getApplicationContext(), "0c07b3a819", false);
    }

    public void feat1() {
        Log.e(TAG, "feat1: add function feat1 on feat1");
    }
}
