package com.example.mlretrocomputacion.data.roomdb;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.example.mlretrocomputacion.data.Model.Item;
import com.example.mlretrocomputacion.data.roomdb.asynstask.DeleteAsynctaskRoom;
import com.example.mlretrocomputacion.data.roomdb.asynstask.InsertAsynctaskRoom;

import java.util.List;

public class RoomRepository {

    private ItemDao itemDao;
    private LiveData<List<Item>> listFavItems;

    public RoomRepository(Application application){
        ItemRoomDatabase db = ItemRoomDatabase.getDatabase(application);
        itemDao = db.itemDao();
        listFavItems = itemDao.getFavItems();
    }

    public LiveData<List<Item>> getFavItems(){
        return listFavItems;
    }

    public void insertFavCity (Item item){
        new InsertAsynctaskRoom(itemDao).execute(item);
    }

    public void deleteCityFav (String idItem){
        new DeleteAsynctaskRoom(itemDao).execute(idItem);
    }
}
