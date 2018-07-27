package com.newyork.times.viewModel;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.BindingAdapter;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.newyork.times.model.Result;
import com.newyork.times.view.activity.ArticleDetailActivity;



public class ItemUserViewModel extends BaseObservable {

    private Result user;
    private Context context;

    public ItemUserViewModel(Result user, Context context){
        this.user = user;
        this.context = context;
    }

    public String getProfileThumb() {
        return user.getMedia().get(0).getMediaMetadata().get(1).getUrl();
    }

    // Loading Image using Glide Library.
    @BindingAdapter("imageUrl") public static void setImageUrl(ImageView imageView, String url){
        Glide.with(imageView.getContext()).load(url).into(imageView);
    }

    public String getCell() { return user.getByline(); }

    public String getEmail() { return user.getSource(); }

    public String getFullName() {

//        user.fullName = user.name.title + "." + user.name.first + " " + user.name.last;

        return user.getTitle();

    }

    public void onItemClick(View v){
        context.startActivity(ArticleDetailActivity.fillDetail(v.getContext(), user));
    }

    public void setUser(Result user) {
        this.user = user;
        notifyChange();
    }
}
