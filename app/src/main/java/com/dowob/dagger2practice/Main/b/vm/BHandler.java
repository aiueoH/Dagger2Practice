package com.dowob.dagger2practice.Main.b.vm;

import com.dowob.dagger2practice.Main.b.v.IBView;
import com.dowob.dagger2practice.Main.m.IMainModel;

/**
 * Created by Wei on 2016/10/20.
 */

public class BHandler implements IBHandler {
    IMainModel mainModel;
    IBView bView;

    public BHandler(IBView bView) {
        this.bView = bView;
    }
}
