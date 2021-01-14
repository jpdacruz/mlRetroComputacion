package com.example.mlretrocomputacion.utils;

import android.text.TextUtils;

public class Utils {

    public final static String URL_BASE ="https://api.mercadolibre.com/";
    public final static String API_VERSION = "2#json";

    public static boolean validarName(String name) {
        if (name == null || TextUtils.isEmpty(name)){
            return false;
        }else{
            return true;
        }
    }
}
