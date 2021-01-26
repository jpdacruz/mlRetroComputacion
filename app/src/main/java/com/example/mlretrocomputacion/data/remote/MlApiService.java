package com.example.mlretrocomputacion.data.remote;

import com.example.mlretrocomputacion.data.mvp.details.clases.DetailModel;
import com.example.mlretrocomputacion.data.remote.clases.ItemResponse;
import com.example.mlretrocomputacion.data.mvp.question.clases.QuestionResponse;
import com.example.mlretrocomputacion.data.mvp.details.clases.UserModel;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface MlApiService {

    @GET("sites/MLA/search?q=retro%game&category=MLA438566")
    Call<ItemResponse> getAllRetroGames();

    @GET("sites/MLA/search?category=MLA438566")
    Call<ItemResponse> getClassicRetroList(
            @Query("q") String consola
    );

    @GET("items/{idItem}")
    Call<DetailModel> getDetailItem(
            @Path("idItem") String idItem
    );

    @GET("users/{idUser}")
    Call<UserModel> getDetailUser(
            @Path("idUser") Integer idUser
    );

    @GET("questions/search?")
    Call<QuestionResponse> getQuestionItem(
            @Query("item") String idItem,
            @Query("api_version") String apiVersion
    );
}
