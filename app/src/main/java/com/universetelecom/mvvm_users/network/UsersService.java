package com.universetelecom.mvvm_users.network;

import com.universetelecom.mvvm_users.model.UserResponse;

import io.reactivex.Observable;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Url;



public interface UsersService {

    @GET
    Observable<UserResponse> fetchUsers(@Url String url);
}
