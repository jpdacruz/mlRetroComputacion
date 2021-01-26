package com.example.mlretrocomputacion.data.mvp.details;

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
    public void showIfItemIsActive(Boolean isChecked,String itemTitle) {
        if (view!=null){
            view.showIfItemIsActive(isChecked, itemTitle);
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
    public void getItemifActive(String idItem, String itemTitle) {
        if (view!=null){
            model.getItemifActive(idItem,itemTitle);
        }
    }
}
