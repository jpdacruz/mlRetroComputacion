package com.example.mlretrocomputacion.data.remote;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.example.mlretrocomputacion.data.Model.Item;
import com.example.mlretrocomputacion.data.Model.ItemResponse;
import com.example.mlretrocomputacion.utils.Constants;
import com.facebook.stetho.okhttp3.StethoInterceptor;
import java.util.ArrayList;
import java.util.List;
import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Repository {

    private static final String TAG = "Repository";
    private final MlApiService mlApiService;
    private MutableLiveData<List<Item>> mutableList;
    private List<Item> listItem;

    public Repository(){

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addNetworkInterceptor(new StethoInterceptor())
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constants.URLMAIN)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        mlApiService = retrofit.create(MlApiService.class);
    }

    public MutableLiveData<List<Item>> getListRetroCategoryMutableList() {
        this.listItem = new ArrayList<>();
        this.mutableList = new MutableLiveData<>();
        getListRetroCategory();
        return mutableList;
    }

    public void getListRetroCategory(){

        Call<ItemResponse> call = mlApiService.getAllRetroGames();
        call.enqueue(new Callback<ItemResponse>() {
            @Override
            public void onResponse(Call<ItemResponse> call, Response<ItemResponse> response) {

                System.out.println("conectado");
                for (int i=0; i< response.body().getResults().size(); i++){

                    Item item = new Item();
                    item.setItemTitle(response.body().getResults().get(i).getTitle());
                    item.setItemPrice(response.body().getResults().get(i).getPrice());
                    listItem.add(item);
                }
                mutableList.setValue(listItem);
            }
            @Override
            public void onFailure(Call<ItemResponse> call, Throwable t) {
                Log.i(TAG, "Call Retrofit onFailure: " + t.toString());
            }
        });
    }
}
