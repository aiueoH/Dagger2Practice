package com.dowob.dagger2practice.Main.vm;

import android.util.Log;
import android.view.View;

import com.dowob.dagger2practice.Main.m.IMainModel;

/**
 * Created by Wei on 2016/10/20.
 */

public class MainHandler implements IMainHandler {
    IMainModel mainModel;

    @Override
    public void onClickCancelBtn(View v) {
        Log.d("MainHandler", "click cancel btn");
    }
}
