package com.haha.mymvp.view;


import android.os.Bundle;

import com.haha.mymvp.R;

import static com.haha.mymvp.utils.MyLog.myLog;

import com.haha.mymvp.intfc.IMainActivityInterface;
import com.haha.mymvp.model.AppManager;
import com.haha.mymvp.presenter.MainActivityPresenter;


public class MainActivity extends BaseActivity implements IMainActivityInterface {
    public static final String TAG = MainActivity.class.getSimpleName();

    public MainActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        myLog(TAG,"onCreate");
        super.onCreate(savedInstanceState);

        presenter = new MainActivityPresenter(this);
    }

    @Override
    protected void initViews() {
        myLog(TAG,"initViews");
        super.initViews();

        setContentView(R.layout.activity_main);
    }

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    protected void onResume() {
        myLog(TAG,"onResume");
        super.onResume();

        AppManager.getAppMgr().mMainHandler.sendEmptyMessage(100);


    }
}
