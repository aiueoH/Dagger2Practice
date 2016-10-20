package com.dowob.dagger2practice.Main.di;

import com.dowob.dagger2practice.Main.vm.IMainHandler;
import com.dowob.dagger2practice.Main.vm.MainHandler;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Wei on 2016/10/20.
 */

@Module
public class MainHandlerModule {
    @Provides
    @Singleton
    IMainHandler provideMainHandler() {
        return new MainHandler();
    }
}
