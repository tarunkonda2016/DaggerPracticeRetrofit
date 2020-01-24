package com.androidapplication.daggerpracticeretrofit.repository;

import com.androidapplication.daggerpracticeretrofit.model.UserModel;
import com.androidapplication.daggerpracticeretrofit.remote.UserService;

import javax.inject.Inject;

import io.reactivex.Single;

public class UserRepository {
    private UserService userService;


    @Inject
    public UserRepository(UserService userService) {
        this.userService = userService;
    }

    public Single<UserModel> getUserModel(){
        return userService.getUserModel();
    }
}
