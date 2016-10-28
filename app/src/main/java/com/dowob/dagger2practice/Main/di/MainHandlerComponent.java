package com.dowob.dagger2practice.Main.di;

import com.dowob.dagger2practice.Main.a.v.AFragment;
import com.dowob.dagger2practice.Main.m.IMainModel;
import com.dowob.dagger2practice.Main.m.MainModel;
import com.dowob.dagger2practice.Main.v.MainActivity;
import com.dowob.dagger2practice.Main.vm.IMainHandler;
import com.dowob.dagger2practice.Main.vm.MainHandler;
import com.dowob.dagger2practice.PerActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Wei on 2016/10/20.
 */

@PerActivity
@Component(modules = MainHandlerModule.class)
public interface MainHandlerComponent {

    void inject(MainActivity mainActivity);

    void inject(MainHandler mainHandler);

    void inject(MainModel mainModel);

    void inject(AFragment aFragment);
}
