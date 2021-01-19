package com.example.mlretrocomputacion.data.roomdb.asynstask;

import android.os.AsyncTask;
import android.util.Log;

import com.example.mlretrocomputacion.data.roomdb.ItemDao;

public class DeleteAsynctaskRoom extends AsyncTask<String,Void,Void> {

    private static final String TAG = "DeleteAsynctaskRoom";
    private ItemDao itemDaoAsyncTask;

    public DeleteAsynctaskRoom(ItemDao dao) {
        this.itemDaoAsyncTask = dao;
    }

    @Override
    protected Void doInBackground(String... strings) {
        itemDaoAsyncTask.deleteByTitle(strings[0]);
        Log.i(TAG, "doInBackground: " + strings[0]);
        return null;
    }
}
