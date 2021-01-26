package com.example.mlretrocomputacion.data.roomdb;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.mlretrocomputacion.data.remote.clases.Item;

@Database(entities = {Item.class}, version = 1)
public abstract class ItemRoomDatabase extends RoomDatabase {

    public abstract ItemDao itemDao();
    private static volatile ItemRoomDatabase INSTANCE;

    public static ItemRoomDatabase getDatabase(final Context context) {

        if (INSTANCE == null) {
            synchronized (ItemRoomDatabase.class) {

                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            ItemRoomDatabase.class, "maindb").build();
                }
            }
        }
        return INSTANCE;
    }
}
