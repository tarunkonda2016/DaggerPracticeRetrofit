package com.androidapplication.daggerpracticeretrofit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import com.androidapplication.daggerpracticeretrofit.ViewModel.UserViewModel;
import com.androidapplication.daggerpracticeretrofit.ViewModel.ViewModelFactory;
import com.androidapplication.daggerpracticeretrofit.databinding.ActivityMainBinding;
import com.androidapplication.daggerpracticeretrofit.model.UserModel;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {


    private ActivityMainBinding binding;

    @Inject
    ViewModelProvider.Factory factory;

    private UserViewModel userModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        ((BaseApplication)getApplication()).getAppComponent().inject(this);

        userModel = ViewModelProviders.of(this,factory).get(UserViewModel.class);

        userModel.getUserModelMutableLiveData().observe(this, new Observer<UserModel>() {
            @Override
            public void onChanged(UserModel userModel) {
                binding.setUser(userModel);
            }
        });
    }
}
