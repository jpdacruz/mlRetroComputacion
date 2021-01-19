package com.example.mlretrocomputacion.ui.favorite;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.mlretrocomputacion.data.Model.Item;
import com.example.mlretrocomputacion.data.roomdb.RoomRepository;

import java.util.List;

public class FavoriteViewModel extends ViewModel {

    private LiveData<List<Item>> listFavItems;
    private RoomRepository roomRepository;

    public FavoriteViewModel() {
        roomRepository = new RoomRepository();
        listFavItems = roomRepository.getFavItems();
    }

    public LiveData<List<Item>> getListRetroCategory(){
        return listFavItems;
    }

    public void insertFavItem(Item newFavItem){
        roomRepository.insertFavItem(newFavItem);
    }

    public void deleteFavItem(String delFavItemTitle){
        roomRepository.deleteFavItem(delFavItemTitle);
    }
}