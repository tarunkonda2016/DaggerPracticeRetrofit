package com.androidapplication.daggerpracticeretrofit;

import android.app.Application;

import com.androidapplication.daggerpracticeretrofit.di.components.AppComponent;
import com.androidapplication.daggerpracticeretrofit.di.components.DaggerAppComponent;

public abstract class BaseApplication extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.create();

    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
