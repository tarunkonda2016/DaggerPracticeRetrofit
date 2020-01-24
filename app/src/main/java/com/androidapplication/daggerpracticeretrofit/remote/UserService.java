package com.androidapplication.daggerpracticeretrofit.remote;

import com.androidapplication.daggerpracticeretrofit.model.UserModel;

import io.reactivex.Single;
import retrofit2.http.GET;

public interface UserService {

    @GET("/users?page=2")
    Single<UserModel> getUserModel();
}
