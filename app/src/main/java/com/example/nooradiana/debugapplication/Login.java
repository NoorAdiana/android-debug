package com.example.nooradiana.debugapplication;

import com.google.gson.annotations.SerializedName;

public class Login {
    @SerializedName("email")
    String email;

    @SerializedName("password")
    String password;

    public Login(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
