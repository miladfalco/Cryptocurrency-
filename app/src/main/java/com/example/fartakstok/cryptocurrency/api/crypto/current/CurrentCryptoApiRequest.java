package com.example.fartakstok.cryptocurrency.api.crypto.current;

import com.example.fartakstok.cryptocurrency.api.RetrofitBuilder;
import com.example.fartakstok.cryptocurrency.model.CurrentCrypto;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;

/**
 * Created by fartakstok on 01/21/2018.
 */

public class CurrentCryptoApiRequest {

    public static void getCurrentCrypto(String cryptoName,Callback<CurrentCrypto> callback) {

        Retrofit retrofit = RetrofitBuilder.getRetrofit();

        CurrentCryptoApi currentCryptoApi = retrofit.create(CurrentCryptoApi.class);

        Call<CurrentCrypto> currentCrypto = currentCryptoApi.getCurrentCrypto(RetrofitBuilder.APP_ID,cryptoName);

        currentCrypto.enqueue(callback);
    }
}

//cryptoName,RetrofitBuilder.APP_ID