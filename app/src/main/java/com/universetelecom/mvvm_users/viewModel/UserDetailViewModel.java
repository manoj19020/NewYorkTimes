package com.universetelecom.mvvm_users.viewModel;


import android.databinding.BindingAdapter;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.universetelecom.mvvm_users.model.Result;
import com.universetelecom.mvvm_users.model.User;

import java.util.Observable;


/*
** This Class as ViewModel to exposes streams of data relevant to the View (ArticleDetailActivity).
 */

public class UserDetailViewModel extends Observable {

    private Result user;

    public UserDetailViewModel(Result user) {this.user = user;}

    public String getFullUserName(){
//        user.fullName = user.name.title + "." + user.name.first + " " + user.name.last ;
        return user.getTitle();
    }

    public String getUserName(){return user.getByline();}

    public String getEmail() { return user.getSource(); }

    public int getEmailVisibility() {
        return /*user.hasEmail() ? View.VISIBLE :*/ View.GONE ;
    }

    public String getCell() { return user.getPublishedDate(); }

    public String getProfileThumb() { return user.getMedia().get(0).getMediaMetadata().get(1).getUrl() ;}

    public String getAddress() {
        return user.getAbstract();
    }

    public String getGender() { return user.getType();}

    @BindingAdapter({"imageUrl"})
    public static void loadImage(ImageView view, String imageUrl){
        Glide.with(view.getContext()).load(imageUrl).into(view);
    }


}
