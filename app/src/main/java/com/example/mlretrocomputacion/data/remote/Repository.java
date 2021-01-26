package com.example.mlretrocomputacion.data.remote;

import android.util.Log;
import android.widget.Toast;

import androidx.lifecycle.MutableLiveData;

import com.example.mlretrocomputacion.MyApp;
import com.example.mlretrocomputacion.data.Model.Item;
import com.example.mlretrocomputacion.data.Model.ItemResponse;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Repository {

    private static final String TAG = "Repository";
    private MutableLiveData<List<Item>> mutableList;
    private List<Item> listItem;

    public Repository(){

        this.listItem = new ArrayList<>();
        this.mutableList = new MutableLiveData<>();
    }

    /*
    get list of retro consolas
    params:

    all -> show all consolas in MLA438566(consolas -> hardware) category
    consola -> search specific consola in MLA438566(consolas -> hardware) category.
                list of consolas to search: atari, snes, n64, ps1, genesis.
     */
    public MutableLiveData<List<Item>> getListRetroCategory(String consola) {
        Call<ItemResponse> call;
        String mConsola = consola;

        if (mConsola.equals("all")){
            call = RetrofitSingleton.getInstance().getMlApiService().getAllRetroGames();
        }else {
            call = RetrofitSingleton.getInstance().getMlApiService().getClassicRetroList(mConsola);
        }

        call.enqueue(new Callback<ItemResponse>() {
            @Override
            public void onResponse(Call<ItemResponse> call, Response<ItemResponse> response) {

                try{
                    int responseSize =response.body().getResults().size();
                    for (int i=0; i< responseSize; i++){
                        Item item = new Item();
                        item.setIdItem(response.body().getResults().get(i).getId());
                        item.setIdUser(response.body().getResults().get(i).getSeller().getId());
                        item.setItemTitle(response.body().getResults().get(i).getTitle());
                        item.setItemPrice(response.body().getResults().get(i).getPrice());
                        item.setThumbnail(response.body().getResults().get(i).getThumbnail());
                        listItem.add(item);
                    }

                    mutableList.setValue(listItem);
                }catch (Exception e) {
                    e.printStackTrace();
                    Log.e(TAG, "Error getting console list" + e.getMessage());
                }
            }
            @Override
            public void onFailure(Call<ItemResponse> call, Throwable t) {
                Log.i(TAG, "Call Retrofit onFailure: " + t.toString());
            }
        });
        return mutableList;
    }
}
