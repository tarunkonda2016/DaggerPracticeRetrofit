package com.androidapplication.daggerpracticeretrofit.ViewModel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.androidapplication.daggerpracticeretrofit.model.UserModel;
import com.androidapplication.daggerpracticeretrofit.repository.UserRepository;

import javax.inject.Inject;

import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;

public class UserViewModel extends ViewModel {

    private UserRepository userRepository;
    private CompositeDisposable compositeDisposable = new CompositeDisposable();
    private MutableLiveData<UserModel> userModelMutableLiveData = new MutableLiveData<>();

    @Inject
    public UserViewModel(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public MutableLiveData<UserModel> getUserModelMutableLiveData() {
        loadData();
        return userModelMutableLiveData;
    }
    private void loadData(){
        compositeDisposable.add(userRepository.getUserModel()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableSingleObserver<UserModel>() {
            @Override
            public void onSuccess(UserModel userModel) {
                getUserModelMutableLiveData().setValue(userModel);
            }

            @Override
            public void onError(Throwable e) {

            }
        }));
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        if (compositeDisposable != null){
            compositeDisposable.clear();
        }
    }
}
