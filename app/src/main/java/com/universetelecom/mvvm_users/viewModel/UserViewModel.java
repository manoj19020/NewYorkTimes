package com.universetelecom.mvvm_users.viewModel;

import android.content.Context;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.Toast;

import com.universetelecom.mvvm_users.R;
import com.universetelecom.mvvm_users.app.AppController;
import com.universetelecom.mvvm_users.model.Result;
import com.universetelecom.mvvm_users.model.UserResponse;
import com.universetelecom.mvvm_users.network.UsersService;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

import static com.universetelecom.mvvm_users.utils.Constant.RANDOM_USER_URL;



public class UserViewModel extends Observable {

    public ObservableInt progressBar;
    public ObservableInt userRecycler;
    public ObservableInt userLabel;
    public ObservableField<String> messageLabel;

    private List<Result> userList;
    private Context context;
    private CompositeDisposable compositeDisposable = new CompositeDisposable();

    public UserViewModel(@NonNull Context context) {
        this.context = context;
        this.userList = new ArrayList<Result>();
        progressBar = new ObservableInt(View.GONE);
        userRecycler = new ObservableInt(View.GONE);
        userLabel = new ObservableInt(View.VISIBLE);
        messageLabel = new ObservableField<>(context.getString(R.string.default_message_loading_users));

        initializeViews();
        fetchUsersList();
    }

    public void onClickFabToLoad(View view) {

    }

    //It is "public" to show an example of test
    public void initializeViews() {
        userLabel.set(View.GONE);
        userRecycler.set(View.GONE);
        progressBar.set(View.VISIBLE);
    }

    private void fetchUsersList() {

        AppController appController = AppController.create(context);
        UsersService usersService = appController.getUserService();

        Disposable disposable = usersService.fetchUsers(RANDOM_USER_URL)
                .subscribeOn(appController.subscribeScheduler())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<UserResponse>() {
                    @Override
                    public void accept(UserResponse userResponse) throws Exception {
//                        if(userResponse.isSuccessful()){
                            Toast.makeText(context, "successful.", Toast.LENGTH_SHORT).show();
//                        }
//                        int length = userResponse.getResults().length;
                        updateUserDataList(userResponse.getResults());
                        progressBar.set(View.GONE);
                        userLabel.set(View.GONE);
                        userRecycler.set(View.VISIBLE);
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        messageLabel.set(context.getString(R.string.error_message_loading_users));
                        progressBar.set(View.GONE);
                        userLabel.set(View.VISIBLE);
                        userRecycler.set(View.GONE);
                    }
                });

        compositeDisposable.add(disposable);
    }

    private void updateUserDataList(List<Result> peoples) {
        userList.addAll(peoples);
        setChanged();
        notifyObservers();
    }

    public List<Result> getUserList() {
        return userList;
    }

    private void unSubscribeFromObservable() {
        if (compositeDisposable != null && !compositeDisposable.isDisposed()) {
            compositeDisposable.dispose();
        }
    }

    public void reset() {
        unSubscribeFromObservable();
        compositeDisposable = null;
        context = null;
    }
}

