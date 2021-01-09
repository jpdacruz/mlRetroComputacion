package com.example.mlretrocomputacion.data.mvp;

import com.example.mlretrocomputacion.data.Model.Item;

public class DetailsPresenter implements DetailsInterface.presenter {

    private DetailsInterface.view view;
    private DetailsInterface.repository model;

    public DetailsPresenter(DetailsInterface.view view) {
        this.view = view;
        this.model = new DetailsRepository(this);
    }

    @Override
    public void showResult(String item, int codResult) {
        if (view!=null){
            view.showResult(item, codResult);
        }
    }

    @Override
    public void getItemDetails(String idItem) {
        if (view!=null){
            model.getItemDetails(idItem);
        }
    }
}
