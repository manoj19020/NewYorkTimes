package com.newyork.times.view.adapter;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.newyork.times.R;
import com.newyork.times.databinding.ItemUserBinding;
import com.newyork.times.model.Result;
import com.newyork.times.viewModel.ItemUserViewModel;

import java.util.Collections;
import java.util.List;


public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserAdapterViewHolder> {

    private List<Result> userList;

    public UserAdapter() {this.userList = Collections.emptyList();}

    @Override
    public UserAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        ItemUserBinding itemUserBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_user ,parent, false);
        return new UserAdapterViewHolder(itemUserBinding);
    }

    @Override
    public void onBindViewHolder(UserAdapterViewHolder holder, int position) {
        holder.bindUser(userList.get(position));

    }

    @Override
    public int getItemCount() {
        return  userList.size();
    }

    public void setUserList(List<Result> userList) {
        this.userList = userList;
        notifyDataSetChanged();
    }

    public static class UserAdapterViewHolder extends RecyclerView.ViewHolder {

        ItemUserBinding mItemUserBinding;

        public UserAdapterViewHolder(ItemUserBinding itemUserBinding) {
            super(itemUserBinding.itemPeople);
            this.mItemUserBinding = itemUserBinding;
        }

        void bindUser(Result user){
            if(mItemUserBinding.getUserViewModel() == null){
                mItemUserBinding.setUserViewModel(new ItemUserViewModel(user, itemView.getContext()));
            }else {
                mItemUserBinding.getUserViewModel().setUser(user);
            }
        }
    }
}
