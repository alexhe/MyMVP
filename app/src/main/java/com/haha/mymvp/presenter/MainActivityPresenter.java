package com.haha.mymvp.presenter;

import com.haha.mymvp.intfc.IMainActivityInterface;

/**
 * Created by haha on 19-7-4.
 */

public class MainActivityPresenter {
    IMainActivityInterface mIntfc;

    public MainActivityPresenter(IMainActivityInterface intfc)
    {
        mIntfc = intfc;
    }
}
