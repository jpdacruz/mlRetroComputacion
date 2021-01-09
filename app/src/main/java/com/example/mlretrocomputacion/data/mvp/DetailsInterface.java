package com.example.mlretrocomputacion.data.mvp;

import com.example.mlretrocomputacion.data.Model.Item;

public interface DetailsInterface {

    interface view{
        void showResult(String item, int codResult);
    }

    interface presenter {
        void showResult(String item, int codResult);
        void getItemDetails(String idItem);
    }

    interface repository {
        void getItemDetails(String idItem);
    }
}
