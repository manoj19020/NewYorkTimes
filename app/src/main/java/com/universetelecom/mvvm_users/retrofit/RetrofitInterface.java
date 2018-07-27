package com.universetelecom.mvvm_users.retrofit;

import com.universetelecom.mvvm_users.model.UserResponse;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.http.Url;

/**
 * Created by Ashish.Tamrakar on 2/1/2018.
 */

public interface RetrofitInterface {
    @GET
    Call<UserResponse> fetchUsers(@Url String url);
}
