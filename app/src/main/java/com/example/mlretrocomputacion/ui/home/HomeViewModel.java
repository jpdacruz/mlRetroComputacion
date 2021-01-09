package com.example.mlretrocomputacion.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mlretrocomputacion.data.Model.Item;
import com.example.mlretrocomputacion.data.remote.Repository;

import java.util.List;

public class HomeViewModel extends ViewModel {

    private Repository repository;
    private MutableLiveData<List<Item>> mRetroCategoryList;

    public HomeViewModel() {
        repository = new Repository();
    }

    public MutableLiveData<List<Item>> getListRetroCategory() {
        mRetroCategoryList = repository.getListRetroCategoryMutableList();
        return mRetroCategoryList;
    }
}