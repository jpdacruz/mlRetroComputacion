package com.example.mlretrocomputacion.data.remote;

import com.example.mlretrocomputacion.data.Model.DetailModel;
import com.example.mlretrocomputacion.data.Model.ItemModel;
import com.example.mlretrocomputacion.data.Model.ItemResponse;
import com.example.mlretrocomputacion.data.Model.QuestionModel;
import com.example.mlretrocomputacion.data.Model.UserModel;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface MlApiService {

    @GET("search?q=retro%game&category=MLA438566")
    Call<ItemResponse> getAllRetroGames();

    @GET("items/{idItem}")
    Call<DetailModel> getDetailItem(
            @Path("idItem") String idItem
    );

    @GET("users/{idUser}")
    Call<UserModel> getDetailUser(
            @Path("idUser") Integer idUser
    );

    @GET("search?")
    Call<QuestionModel> getQuestionItem(
            @Query("item") String idItem,
            @Query("api_version") String apiVersion
    );
}
