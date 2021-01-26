package com.example.mlretrocomputacion.data.utils;

import android.text.TextUtils;

import com.example.mlretrocomputacion.data.Model.Item;

import java.util.List;

public class Utils {

    //CONSTANTS
    public final static String URL_BASE ="https://api.mercadolibre.com/";
    public final static String API_VERSION = "2#json";

    public static boolean validarName(String name) {
        if (name == null || TextUtils.isEmpty(name)){
            return false;
        }else{
            return true;
        }
    }

    public static boolean isItemExist(List<Item> items, String idItem) {
        for (Item i : items) {
            if (i.getIdItem().contains(idItem)) {
                return true;
            }
        }
        return false;
    }
}
