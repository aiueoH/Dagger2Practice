package com.dowob.dagger2practice.Main.di;

import com.dowob.dagger2practice.Main.m.IMainModel;
import com.dowob.dagger2practice.Main.m.MainModel;
import com.dowob.dagger2practice.Main.vm.IMainHandler;
import com.dowob.dagger2practice.Main.vm.MainHandler;
import com.dowob.dagger2practice.PerActivity;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Wei on 2016/10/20.
 */

@Module
public class MainHandlerModule {
    @PerActivity
    @Provides
    IMainHandler provideMainHandler() {
        return new MainHandler();
    }

    @PerActivity
    @Provides
    IMainModel provideMainModel() {
        return new MainModel();
    }
}
