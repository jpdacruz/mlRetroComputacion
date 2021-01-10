package com.example.mlretrocomputacion.data.mvp;

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
            (String title, String condition, Double price, String city, String state, String permalink, List<String> pictures, int codResult) {
        if (view!=null){
            view.showItemResult(title, condition, price, city, state, permalink,pictures, codResult);
        }
    }

    @Override
    public void showUserResult(int cod) {
        if (view!=null){
            view.showUserResult(cod);
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
}
