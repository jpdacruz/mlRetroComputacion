package com.example.mlretrocomputacion;

import android.app.Application;
import android.content.Context;

import com.facebook.stetho.Stetho;

public class MyApp extends Application {

    public static MyApp instance;

    public static MyApp getInstance(){
        return instance;
    }

    public static Context getContext(){
        return instance;
    }

    @Override
    public void onCreate() {
        instance = this;
        super.onCreate();
        Stetho.initializeWithDefaults(this);
    }
}
