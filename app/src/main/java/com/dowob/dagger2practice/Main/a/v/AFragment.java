package com.dowob.dagger2practice.Main.a.v;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dowob.dagger2practice.Main.ComponentStore;
import com.dowob.dagger2practice.Main.di.DaggerMainHandlerComponent;
import com.dowob.dagger2practice.Main.m.IMainModel;
import com.dowob.dagger2practice.Main.v.IMainView;
import com.dowob.dagger2practice.Main.vm.IMainHandler;
import com.dowob.dagger2practice.R;

import javax.inject.Inject;

public class AFragment extends Fragment implements IAView {

    @Inject
    IMainHandler mainHandler;

    public AFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ComponentStore.getInstance().getMainHandlerC().inject(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_a, container, false);
    }

    @Override
    public void switchToBPage() {
        ((IMainView) getActivity()).switchToBPage();
    }
}
