package com.newyork.times.view.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import com.newyork.times.R;
import com.newyork.times.databinding.ActivityUsersBinding;
import com.newyork.times.view.adapter.UserAdapter;
import com.newyork.times.viewModel.UserViewModel;

import java.util.Observable;
import java.util.Observer;

public class ArticleListActivity extends AppCompatActivity implements Observer {

    private ActivityUsersBinding userActivityBinding;
    private UserViewModel userViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initDataBinding();
        setSupportActionBar(userActivityBinding.toolbar);
        setUpListOfUsersView(userActivityBinding.listUser);
        setUpObserver(userViewModel);
    }

    private void initDataBinding() {
        userActivityBinding = DataBindingUtil.setContentView(this, R.layout.activity_users);
        userViewModel = new UserViewModel(this);
        userActivityBinding.setUserViewModel(userViewModel);
    }

    // set up the list of user with recycler view
    private void setUpListOfUsersView(RecyclerView listUser) {
        UserAdapter userAdapter = new UserAdapter();
        listUser.setAdapter(userAdapter);
        listUser.setLayoutManager(new LinearLayoutManager(this));
    }

    public void setUpObserver(Observable observable) {
        observable.addObserver(this);
    }


    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof  UserViewModel) {
            UserAdapter userAdapter = (UserAdapter) userActivityBinding.listUser.getAdapter();
            UserViewModel userViewModel = (UserViewModel) o;
            userAdapter.setUserList(userViewModel.getUserList());
        }
    }

    @Override public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    @Override public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    @Override protected void onDestroy() {
        super.onDestroy();
        userViewModel.reset();
    }

}
