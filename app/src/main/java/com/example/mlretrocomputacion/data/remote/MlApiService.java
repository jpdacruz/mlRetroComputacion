package com.example.mlretrocomputacion.data.remote;

import com.example.mlretrocomputacion.data.Model.ItemModel;
import com.example.mlretrocomputacion.data.Model.ItemResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MlApiService {

    @GET("search?q=retro%game&category=MLA438566")
    Call<ItemResponse> getAllRetroGames();
}
