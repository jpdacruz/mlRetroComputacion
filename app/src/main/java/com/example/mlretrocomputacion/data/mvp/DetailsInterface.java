package com.example.mlretrocomputacion.data.mvp;

import com.example.mlretrocomputacion.data.Model.Item;

import java.util.List;

public interface DetailsInterface {

    interface view{
        void showResult(String title, String condition, Double price, String city, String state, String permalink, List<String> pictures, int codResult);
    }

    interface presenter {
        void showResult(String title,String condition, Double price, String city,String state, String permalink, List<String> pictures, int codResult);
        void getItemDetails(String idItem);
    }

    interface repository {
        void getItemDetails(String idItem);
    }
}
