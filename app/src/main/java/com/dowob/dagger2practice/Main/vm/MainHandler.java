package com.dowob.dagger2practice.Main.vm;

import android.util.Log;
import android.view.View;

import com.dowob.dagger2practice.Main.ComponentStore;
import com.dowob.dagger2practice.Main.di.DaggerMainHandlerComponent;
import com.dowob.dagger2practice.Main.di.MainHandlerComponent;
import com.dowob.dagger2practice.Main.di.MainHandlerModule;
import com.dowob.dagger2practice.Main.m.IMainModel;

import javax.inject.Inject;

/**
 * Created by Wei on 2016/10/20.
 */

public class MainHandler implements IMainHandler {
    @Inject
    IMainModel mainModel;

    public MainHandler() {
        ComponentStore.getInstance().getMainHandlerC().inject(this);
        Log.d("MainHandler", "main handle constructor");
    }

    @Override
    public void onClickCancelBtn(View v) {
        Log.d("MainHandler", "click cancel btn");
        mainModel.addClickBtnCount();
    }
}
