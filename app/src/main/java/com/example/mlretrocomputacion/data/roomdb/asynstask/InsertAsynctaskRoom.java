package com.example.mlretrocomputacion.data.roomdb.asynstask;

import android.os.AsyncTask;

import com.example.mlretrocomputacion.data.Model.Item;
import com.example.mlretrocomputacion.data.roomdb.ItemDao;

public class InsertAsynctaskRoom extends AsyncTask<Item, Void, Void> {

    private ItemDao itemDaoAsyncTask;

    public InsertAsynctaskRoom(ItemDao dao) {
        this.itemDaoAsyncTask = dao;
    }

    @Override
    protected Void doInBackground(Item... items) {
        itemDaoAsyncTask.insert(items[0]);
        return null;
    }
}
