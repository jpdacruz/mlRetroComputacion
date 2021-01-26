package com.example.mlretrocomputacion.data.remote.clases;

import com.example.mlretrocomputacion.data.remote.clases.ItemModel;

import java.util.List;

/*
Model class to help with server response.
Retrieves the information about all items listed in a specific MercadoLibres category -> public List<ItemModel> getResults()
 */
public class ItemResponse {

    private List<ItemModel> results;

    public List<ItemModel> getResults() {
        return results;
    }
    public void setResults(List<ItemModel> results) {
        this.results = results;
    }
}
