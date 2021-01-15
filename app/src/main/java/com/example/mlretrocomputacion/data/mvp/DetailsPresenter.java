package com.example.mlretrocomputacion.data.mvp;

import com.example.mlretrocomputacion.data.remote.DetailsRepository;

import java.util.List;

public class DetailsPresenter implements DetailsInterface.presenter {

    private DetailsInterface.view view;
    private DetailsInterface.repository model;

    public DetailsPresenter(DetailsInterface.view view) {
        this.view = view;
        this.model = new DetailsRepository(this);
    }

    @Override
    public void showItemResult
            (String title, String condition, Double price, String city, String state, String permalink, List<String> pictures) {
        if (view!=null){
            view.showItemResult(title, condition, price, city, state, permalink,pictures);
        }
    }

    @Override
    public void showUserResult(String usuario, String registerSince, Integer transactions, String number_reputation, String color_reputation) {
        if (view!=null){
            view.showUserResult(usuario,registerSince,transactions, number_reputation,color_reputation);
        }
    }

    @Override
    public void showQuestionResult(int cod) {
        if (view!=null){
            view.showQuestionResult(cod);
        }
    }

    @Override
    public void getItemDetails(String idItem) {
        if (view!=null){
            model.getItemDetails(idItem);
        }
    }

    @Override
    public void getUserDetails(Integer idUser) {
        if (view!=null){
            model.getUserDetails(idUser);
        }
    }

    @Override
    public void getItemQuestions(String idItem) {
        if (view!=null){
            model.getItemQuestions(idItem);
        }
    }
}
