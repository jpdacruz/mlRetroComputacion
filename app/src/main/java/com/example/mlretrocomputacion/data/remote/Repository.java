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
    private MutableLiveData<List<Item>> mutableList;
    private List<Item> listItem;

    public Repository(){

        this.listItem = new ArrayList<>();
        this.mutableList = new MutableLiveData<>();
    }

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
                    for (int i=0; i< response.body().getResults().size(); i++){
                        Item item = new Item();
                        item.setIdItem(response.body().getResults().get(i).getId());
                        item.setIdUser(response.body().getResults().get(i).getSeller().getId());
                        item.setItemTitle(response.body().getResults().get(i).getTitle());
                        item.setItemPrice(response.body().getResults().get(i).getPrice());
                        item.setThumbnail(response.body().getResults().get(i).getThumbnail());

                        try{
                            String full_reputation;
                            String number_reputation;
                            String color_reputation;

                            full_reputation = response.body().getResults().get(i).getSeller().getSellerReputation().getLevelId();
                            if (full_reputation != null){
                                String[] parts = full_reputation.split("_");
                                number_reputation = parts[0];
                                color_reputation = parts[1];
                                item.setLevel_reputation(number_reputation);
                                item.setColor_reputacion(color_reputation);
                            }else{
                                item.setLevel_reputation("nueva");
                                item.setColor_reputacion("grey");
                            }

                        }catch (Exception e){
                            e.printStackTrace();
                            Log.e(TAG, e.getMessage());
                        }

                        listItem.add(item);
                    }

                }catch (Exception e){
                    e.printStackTrace();
                    Log.e(TAG, e.getMessage());
                }


                mutableList.setValue(listItem);
            }
            @Override
            public void onFailure(Call<ItemResponse> call, Throwable t) {
                Log.i(TAG, "Call Retrofit onFailure: " + t.toString());
            }
        });
        return mutableList;
    }
}
