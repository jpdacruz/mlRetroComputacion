package com.example.mlretrocomputacion.data.mvp;

import com.example.mlretrocomputacion.data.Model.Item;

import java.util.List;

public interface DetailsInterface {

    interface view{
        void showItemResult(String title, String condition, Double price, String city, String state, String permalink, List<String> pictures);
        void showUserResult(String usuario, String registerSince, Integer transactions, String number_reputation, String color_reputation);
        void showQuestionResult(int totalQuestions);
        void showIfItemIsActive(Boolean isChecked, String itemTitle);
    }

    interface presenter {
        void showItemResult(String title, String condition, Double price, String city, String state, String permalink, List<String> pictures);
        void showUserResult(String usuario, String registerSince, Integer transactions, String number_reputation, String color_reputation);
        void showQuestionResult(int totalQuestions);
        void showIfItemIsActive(Boolean isChecked, String itemTitle);
        void getItemDetails(String idItem);
        void getUserDetails(Integer idUser);
        void getItemQuestions(String idItem);
        void getItemifActive(String idItem, String itemTitle);
    }

    interface repository {
        void getItemDetails(String idItem);
        void getUserDetails(Integer idUser);
        void getItemQuestions(String idItem);
        void getItemifActive(String idItem, String itemTitle);
    }
}
