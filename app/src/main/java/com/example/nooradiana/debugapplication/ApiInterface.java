package com.example.nooradiana.debugapplication;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiInterface {
    @POST("auth/login")
    Call<User> authentication(@Body Login login);
}
