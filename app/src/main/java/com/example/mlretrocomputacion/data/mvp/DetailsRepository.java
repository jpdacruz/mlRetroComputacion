package com.example.mlretrocomputacion.data.mvp;

public class DetailsRepository implements DetailsInterface.repository{

    private static final String TAG = "DetailsModel";
    private DetailsInterface.presenter presenter;

    public DetailsRepository(DetailsInterface.presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void getItemDetails(String idItem) {

        presenter.showResult(idItem,1);

    }
}
