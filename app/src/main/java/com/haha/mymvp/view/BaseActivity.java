package com.haha.mymvp.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static com.haha.mymvp.utils.MyLog.myLog;


public abstract  class BaseActivity extends AppCompatActivity {
    public static final String TAG = BaseActivity.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        myLog(TAG,"onCreate");
        super.onCreate(savedInstanceState);

        initViews();
    }

    protected void initViews(){
        myLog(TAG,"initViews");
    }

    @Override
    protected void onStart() {
        myLog(TAG,"onStart");
        super.onStart();

    }

    @Override
    protected void onRestart() {
        myLog(TAG,"onRestart");
        super.onRestart();

    }

    @Override
    protected void onResume() {
        myLog(TAG,"onResume");
        super.onResume();

    }


    @Override
    protected void onPause() {
        myLog(TAG,"onPause");

        super.onPause();

    }

    @Override
    protected void onStop() {
        myLog(TAG,"onStop");

        super.onStop();

    }


    @Override
    protected void onDestroy() {
        myLog(TAG,"onDestroy");

        super.onDestroy();
    }

}
