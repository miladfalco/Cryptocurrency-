package com.example.fartakstok.cryptocurrency.api;

import android.content.ContentProviderOperation;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by fartakstok on 01/21/2018.
 */

public class RetrofitBuilder {
    public static final String APP_ID = "webservice/api/";
    public static final String BASE_URL = "https://digiarz.com/";


    public static Retrofit getRetrofit() {
        Retrofit.Builder builder = new Retrofit.Builder();
        return builder.baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

    }

}
