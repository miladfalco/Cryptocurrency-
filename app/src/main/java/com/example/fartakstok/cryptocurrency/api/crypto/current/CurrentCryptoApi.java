package com.example.fartakstok.cryptocurrency.api.crypto.current;

import com.example.fartakstok.cryptocurrency.model.CurrentCrypto;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.Url;

/**
 * Created by fartakstok on 01/21/2018.
 */

public interface CurrentCryptoApi {
    @GET("webservice/api/")
    Call<CurrentCrypto> getCurrentCrypto(@Query("APPID") String appId, @Query("c") String cryptoName);


    @GET
    Call<CurrentCrypto> getCurrentCrypto(@Url String dynamicUrl);


}

//    @Query("c") String cryptoName,@Query("APPID") String appId