package com.dowob.dagger2practice.Main;

import com.dowob.dagger2practice.Main.di.DaggerMainHandlerComponent;
import com.dowob.dagger2practice.Main.di.MainHandlerComponent;

/**
 * Created by Wei on 2016/10/24.
 */
public class ComponentStore {
    private static ComponentStore ourInstance = new ComponentStore();

    public static ComponentStore getInstance() {
        return ourInstance;
    }

    private MainHandlerComponent mainHandlerComponent;

    private ComponentStore() {
        mainHandlerComponent = DaggerMainHandlerComponent.create();
    }

    public MainHandlerComponent getMainHandlerC() {
        return mainHandlerComponent;
    }
}
