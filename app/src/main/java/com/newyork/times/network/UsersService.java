package com.newyork.times.network;

import com.newyork.times.model.UserResponse;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Url;



public interface UsersService {

    @GET
    Observable<UserResponse> fetchUsers(@Url String url);
}
