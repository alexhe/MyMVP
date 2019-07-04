package com.haha.mymvp.view;

import android.app.Application;

import com.haha.mymvp.model.AppManager;
import com.haha.mymvp.utils.MyLog;

/**
 * Created by haha on 19-7-4.
 */

public class BaseApplication extends Application {
    public static final String TAG = "MyApp";
    @Override
    public void onCreate() {
        MyLog.myLog(TAG, "onCreate");
        super.onCreate();

        initApp();
    }

    private void initApp() {
        MyLog.myLog(TAG, "initApp");

        AppManager.setContext(this.getApplicationContext());
        AppManager.getAppMgr();
    }
}
