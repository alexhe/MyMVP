package com.haha.mymvp.utils;

import android.util.Log;

/**
 * Created by haha on 19-7-4.
 */

public class MyLog {
    public static final String TAG = MyLog.class.getSimpleName();

    public static void myLog(String msg) {
        myLog(TAG, msg);
    }

    public static void myLog(String tag, String msg) {
        Log.d(TAG + "-"+ tag, msg);
    }


}
