package com.newyork.times.retrofit;

import com.newyork.times.model.UserResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by Ashish.Tamrakar on 2/1/2018.
 */

public interface RetrofitInterface {
    @GET
    Call<UserResponse> fetchUsers(@Url String url);
}
