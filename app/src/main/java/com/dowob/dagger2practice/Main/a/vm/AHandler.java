package com.dowob.dagger2practice.Main.a.vm;

import android.view.View;

import com.dowob.dagger2practice.Main.a.v.IAView;
import com.dowob.dagger2practice.Main.m.IMainModel;

/**
 * Created by Wei on 2016/10/20.
 */

public class AHandler implements IAHandler {
    IMainModel mainModel;
    IAView aView;

    public AHandler(IAView aView) {
        this.aView = aView;
    }

    @Override
    public void onClickToBBtn(View v) {
    }
}
