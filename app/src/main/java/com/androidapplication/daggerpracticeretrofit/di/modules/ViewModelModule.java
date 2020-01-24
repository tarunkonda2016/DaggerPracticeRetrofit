package com.androidapplication.daggerpracticeretrofit.di.modules;


import androidx.lifecycle.ViewModel;

import com.androidapplication.daggerpracticeretrofit.ViewModel.UserViewModel;
import com.androidapplication.daggerpracticeretrofit.ViewModel.ViewModelFactory;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(UserViewModel.class)
    abstract ViewModel bindViews(UserViewModel userViewModel);

    @Binds
    abstract ViewModelFactory bindFactory(ViewModelFactory viewModelFactory);

}
