package com.example.mlretrocomputacion.data.roomdb;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.mlretrocomputacion.data.Model.Item;

import java.util.List;

@Dao
public interface ItemDao {

    @Insert
    void insert(Item item);

    @Query("DELETE FROM itemTable WHERE itemTitle = :itemTitle")
    void deleteByTitle(String itemTitle);

    @Query("SELECT * FROM itemTable ORDER BY itemTitle ASC")
    LiveData<List<Item>> getFavItems();
}
