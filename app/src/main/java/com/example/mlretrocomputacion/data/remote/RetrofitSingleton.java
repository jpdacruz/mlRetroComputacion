package com.example.mlretrocomputacion.data.remote;

import com.example.mlretrocomputacion.data.utils.Utils;
import com.facebook.stetho.okhttp3.StethoInterceptor;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitSingleton {

    private static RetrofitSingleton instance = null;
    private Retrofit retrofit;
    private OkHttpClient okHttpClient;
    private MlApiService mlApiService;

    public  RetrofitSingleton(){

        okHttpClient = new OkHttpClient.Builder()
                .addNetworkInterceptor(new StethoInterceptor())
                .build();

        retrofit = new Retrofit.Builder()
                .baseUrl(Utils.URL_BASE)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        mlApiService = retrofit.create(MlApiService.class);
    }

    public static RetrofitSingleton getInstance() {
        if (instance == null) {
            instance = new RetrofitSingleton();
        }
        return instance;
    }

    public MlApiService getMlApiService() {
        return mlApiService;
    }
}
