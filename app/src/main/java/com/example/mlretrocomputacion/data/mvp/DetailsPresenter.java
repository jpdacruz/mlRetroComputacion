package com.example.mlretrocomputacion.data.mvp;

import com.example.mlretrocomputacion.data.Model.Item;

import java.util.List;

public class DetailsPresenter implements DetailsInterface.presenter {

    private DetailsInterface.view view;
    private DetailsInterface.repository model;

    public DetailsPresenter(DetailsInterface.view view) {
        this.view = view;
        this.model = new DetailsRepository(this);
    }

    @Override
    public void showResult
            (String title, String condition, Double price, String city, String state, String permalink, List<String> pictures, int codResult) {
        if (view!=null){
            view.showResult(title, condition, price, city, state, permalink,pictures, codResult);
        }
    }

    @Override
    public void getItemDetails(String idItem) {
        if (view!=null){
            model.getItemDetails(idItem);
        }
    }
}
