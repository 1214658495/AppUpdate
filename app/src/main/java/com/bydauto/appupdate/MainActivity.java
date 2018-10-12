package com.bydauto.appupdate;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.tencent.bugly.crashreport.CrashReport;

/**
 * 增加提交人信息
 */
public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.crach);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CrashReport.testJavaCrash();
            }
        });
    }

    public void feature1() {
        Log.i(TAG, "feature1: ");
    }

    public void feature2() {
        Log.i(TAG, "feature2: ");
    }

    public void feature3() {
        Log.i(TAG, "feature3: ");
    }

    public void feature4() {
        Log.i(TAG, "feature4: ");
    }

    public void feature5() {
        Log.i(TAG, "feature5: ");
    }
}
