package com.example.mlretrocomputacion.data.roomdb;

import androidx.lifecycle.LiveData;

import com.example.mlretrocomputacion.MyApp;
import com.example.mlretrocomputacion.data.remote.clases.Item;
import com.example.mlretrocomputacion.data.roomdb.asynstask.DeleteAsynctaskRoom;
import com.example.mlretrocomputacion.data.roomdb.asynstask.InsertAsynctaskRoom;

import java.util.List;

public class RoomRepository {

    private ItemDao itemDao;
    private LiveData<List<Item>> listFavItems;

    public RoomRepository(){
        ItemRoomDatabase db = ItemRoomDatabase.getDatabase(MyApp.getContext());
        itemDao = db.itemDao();
        listFavItems = itemDao.getFavItems();
    }

    public LiveData<List<Item>> getFavItems(){
        return listFavItems;
    }

    public void insertFavItem (Item item){
        new InsertAsynctaskRoom(itemDao).execute(item);
    }

    public void deleteFavItem (String itemTitle){
        new DeleteAsynctaskRoom(itemDao).execute(itemTitle);
    }
}
