package com.example.mlretrocomputacion.data.roomdb.asynstask;

import android.os.AsyncTask;

import com.example.mlretrocomputacion.data.roomdb.ItemDao;

public class DeleteAsynctaskRoom extends AsyncTask<String,Void,Void> {

    private ItemDao itemDaoAsyncTask;

    public DeleteAsynctaskRoom(ItemDao dao) {
        this.itemDaoAsyncTask = dao;
    }


    @Override
    protected Void doInBackground(String... strings) {
        itemDaoAsyncTask.deleteById(strings[0]);
        return null;
    }
}
