package com.example.nooradiana.debugapplication;

public class ApiUtils {

    private ApiUtils() {
    }

    public static final String BASE_URL = "http://zakatpedia.tesaja.com/api/v1/";

    public static ApiInterface getAPIService() {

        return RetrofitClient.getClient(BASE_URL).create(ApiInterface.class);
    }
}
