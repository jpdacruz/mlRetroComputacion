package com.example.mlretrocomputacion.data.mvp;

import com.example.mlretrocomputacion.data.Model.Item;

import java.util.List;

public interface DetailsInterface {

    interface view{
        void showItemResult(String title, String condition, Double price, String city, String state, String permalink, List<String> pictures, int codResult);
        void showUserResult(int cod);
    }

    interface presenter {
        void showItemResult(String title, String condition, Double price, String city, String state, String permalink, List<String> pictures, int codResult);
        void showUserResult(int cod);
        void getItemDetails(String idItem);
        void getUserDetails(Integer idUser);
    }

    interface repository {
        void getItemDetails(String idItem);
        void getUserDetails(Integer idUser);
    }
}
