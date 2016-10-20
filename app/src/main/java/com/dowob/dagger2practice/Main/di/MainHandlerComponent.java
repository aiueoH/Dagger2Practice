package com.dowob.dagger2practice.Main.di;

import com.dowob.dagger2practice.Main.v.MainActivity;
import com.dowob.dagger2practice.Main.vm.IMainHandler;
import com.dowob.dagger2practice.Main.vm.MainHandler;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Wei on 2016/10/20.
 */

@Singleton
@Component(modules = MainHandlerModule.class)
public interface MainHandlerComponent {
//    IMainHandler provideMainHandler();
    void inject(MainActivity mainActivity);
}
