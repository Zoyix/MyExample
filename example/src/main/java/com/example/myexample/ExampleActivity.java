package com.example.myexample;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;

import com.example.latte.core.activities.ProxyActivity;
import com.example.latte.core.delegates.LatteDelegate;

import qiu.niorgai.StatusBarCompat;

public class ExampleActivity extends ProxyActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //隐藏ActionBar
        final ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }

        //引入包后（别忘记project的gradle文件中加入maven），一句话让实现状态栏隐藏
        StatusBarCompat.translucentStatusBar(this, true);
    }

    @Override
    public LatteDelegate setRootDelegate() {
        return new ExampleDelegate();
    }

}
