package com.example.mlretrocomputacion.data.mvp;

import java.util.List;

public interface DetailsInterface {

    interface view{
        void showItemResult(String title, String condition, Double price, String city, String state, String permalink, List<String> pictures);
        void showUserResult(String usuario, String registerSince, Integer transactions, String number_reputation, String color_reputation);
        void showQuestionResult(int totalQuestions);
    }

    interface presenter {
        void showItemResult(String title, String condition, Double price, String city, String state, String permalink, List<String> pictures);
        void showUserResult(String usuario, String registerSince, Integer transactions, String number_reputation, String color_reputation);
        void showQuestionResult(int totalQuestions);
        void getItemDetails(String idItem);
        void getUserDetails(Integer idUser);
        void getItemQuestions(String idItem);
    }

    interface repository {
        void getItemDetails(String idItem);
        void getUserDetails(Integer idUser);
        void getItemQuestions(String idItem);
    }
}
