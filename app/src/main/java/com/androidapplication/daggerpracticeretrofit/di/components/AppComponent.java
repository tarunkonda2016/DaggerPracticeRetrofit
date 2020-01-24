package com.androidapplication.daggerpracticeretrofit.di.components;


import com.androidapplication.daggerpracticeretrofit.MainActivity;
import com.androidapplication.daggerpracticeretrofit.di.modules.ContextModule;
import com.androidapplication.daggerpracticeretrofit.di.modules.NetworkModule;
import com.androidapplication.daggerpracticeretrofit.di.modules.ViewModelModule;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Module;

@Singleton
@Component(modules = {NetworkModule.class , ContextModule.class })
public interface AppComponent {
    void inject (MainActivity mainActivity);
}
