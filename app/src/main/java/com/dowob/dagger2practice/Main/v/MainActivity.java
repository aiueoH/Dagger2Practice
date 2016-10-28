package com.dowob.dagger2practice.Main.v;

import android.databinding.DataBindingUtil;
import android.os.Handler;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;

import com.dowob.dagger2practice.Main.ComponentStore;
import com.dowob.dagger2practice.Main.a.v.AFragment;
import com.dowob.dagger2practice.Main.b.v.BFragment;
import com.dowob.dagger2practice.Main.di.DaggerMainHandlerComponent;
import com.dowob.dagger2practice.Main.di.MainHandlerComponent;
import com.dowob.dagger2practice.Main.di.MainHandlerModule;
import com.dowob.dagger2practice.Main.m.IMainModel;
import com.dowob.dagger2practice.Main.vm.IMainHandler;
import com.dowob.dagger2practice.Main.vm.MainHandler;
import com.dowob.dagger2practice.R;
import com.dowob.dagger2practice.databinding.ActivityMainBinding;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements IMainView {

    @Inject
    IMainHandler mainHandler;

    @Inject
    IMainModel mainModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ComponentStore.getInstance().getMainHandlerC().inject(this);
        mainModel.addClickBtnCount();

//        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setHandlers(mainHandler);
//        binding.setHandlers(new MainHandler());
        switchToAPage();
    }

    @Override
    public void switchToAPage() {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.container, new AFragment());
        ft.commit();
    }

    @Override
    public void switchToBPage() {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.container, new BFragment());
        ft.commit();
    }
}
