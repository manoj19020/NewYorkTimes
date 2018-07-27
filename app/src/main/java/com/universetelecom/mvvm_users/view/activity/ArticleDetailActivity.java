package com.universetelecom.mvvm_users.view.activity;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

import com.universetelecom.mvvm_users.R;
import com.universetelecom.mvvm_users.databinding.ActivityUserDetailBinding;
import com.universetelecom.mvvm_users.model.Result;
import com.universetelecom.mvvm_users.viewModel.UserDetailViewModel;

public class ArticleDetailActivity extends AppCompatActivity {


    private static final String EXTRA_USER = "EXTRA_USER";

    private ActivityUserDetailBinding activityUserDetailBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityUserDetailBinding = DataBindingUtil.setContentView(this, R.layout.activity_user_detail);
        setSupportActionBar(activityUserDetailBinding.toolbar);
        displayHomeAsUpEnabled();
        getExtrasFromIntent();
    }

    private void displayHomeAsUpEnabled() {

        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    public static Intent fillDetail(Context context, Result user) {
        Intent intent = new Intent(context, ArticleDetailActivity.class);
        intent.putExtra(EXTRA_USER, user);
        return intent;
    }

    private void getExtrasFromIntent(){
        Result user = (Result) getIntent().getSerializableExtra(EXTRA_USER);
        UserDetailViewModel userDetailViewModel = new UserDetailViewModel(user);
        activityUserDetailBinding.setUserDetailViewModel(userDetailViewModel);
        getSupportActionBar().setTitle(user.getTitle());
    }
}
