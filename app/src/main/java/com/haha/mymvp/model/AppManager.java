package com.haha.mymvp.model;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

import static com.haha.mymvp.utils.MyLog.myLog;

/**
 * Created by haha on 19-7-4.
 */

public class AppManager {
    public static final String TAG = AppManager.class.getSimpleName();
    private static AppManager appMgr;
    private static Context sContext;
    private AppManager() {
        if (sContext == null) {
            throw new RuntimeException("app context not inited");
        }

        initThreads();
    }
    public static void setContext(Context context) {
        sContext = context;
    }

    public static AppManager getAppMgr() {
        if(appMgr == null) {
            appMgr = new AppManager();
        }
        return appMgr;
    }

    HandlerThread mIOThread = new HandlerThread("ioThread");
    public Handler mIOHandler;

    HandlerThread mNetThread = new HandlerThread("netThread");
    public Handler mNetHandler;

    HandlerThread mBgThread = new HandlerThread("bgThread");
    public Handler mBgHandler;

    public Handler mMainHandler;

    private void initThreads(){
        myLog(TAG,"initThreads");
        mIOThread.start();
        mIOHandler = new Handler(mIOThread.getLooper()) {
            @Override
            public void handleMessage(Message msg) {
                handleIOMessage(msg);
            }
        };

        mNetThread.start();
        mNetHandler = new Handler(mNetThread.getLooper()) {
            @Override
            public void handleMessage(Message msg) {
                handleNetMessage(msg);
            }
        };

        mBgThread.start();
        mBgHandler = new Handler(mBgThread.getLooper()) {
            @Override
            public void handleMessage(Message msg) {
                handleBgMessage(msg);
            }
        };

        mMainHandler = new Handler(Looper.getMainLooper()) {
            @Override
            public void handleMessage(Message msg) {
//                super.handleMessage(msg);
                handleMainMessage(msg);
            }
        };
    }

    private void handleIOMessage(Message msg){

    }

    private void handleNetMessage(Message msg){

    }

    private void handleBgMessage(Message msg){

    }

    private void handleMainMessage(Message msg){
        final int what = msg.what;
        switch (what) {
            case 100:
                myLog("main msg id: 100");
                break;
                default:
                    break;
        }
    }
}
