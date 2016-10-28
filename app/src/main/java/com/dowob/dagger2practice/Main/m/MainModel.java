package com.dowob.dagger2practice.Main.m;

import android.util.Log;

import com.dowob.dagger2practice.Main.di.DaggerMainHandlerComponent;
import com.dowob.dagger2practice.Main.vm.IMainHandler;

import javax.inject.Inject;

/**
 * Created by Wei on 2016/10/20.
 */

public class MainModel implements IMainModel {

    private int count = 0;

    public MainModel() {
        Log.d("MainModel", "main model constructor");
    }

    @Override
    public void addClickBtnCount() {
        count++;
        Log.d("MainModel", "count:" + count);
    }
}
