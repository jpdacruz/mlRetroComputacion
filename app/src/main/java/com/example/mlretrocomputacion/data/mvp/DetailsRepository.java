package com.example.mlretrocomputacion.data.mvp;

import android.util.Log;

import com.example.mlretrocomputacion.data.Model.DetailModel;
import com.example.mlretrocomputacion.data.Model.Item;
import com.example.mlretrocomputacion.data.remote.MlApiService;
import com.example.mlretrocomputacion.utils.Constants;
import com.facebook.stetho.okhttp3.StethoInterceptor;
import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DetailsRepository implements DetailsInterface.repository{

    private static final String TAG = "DetailsModel";
    private DetailsInterface.presenter presenter;
    private MlApiService mlApiService;

    public DetailsRepository(DetailsInterface.presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void getItemDetails(String idItem) {

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addNetworkInterceptor(new StethoInterceptor())
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constants.URL_DETAIL_ITEM)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        mlApiService = retrofit.create(MlApiService.class);

        Call<DetailModel> call = mlApiService.getDetailItem(idItem);
        call.enqueue(new Callback<DetailModel>() {
            @Override
            public void onResponse(Call<DetailModel> call, Response<DetailModel> response) {

                String title = response.body().getTitle();
                String condition = response.body().getCondition();
                Double price = response.body().getPrice();
                String city = response.body().getSellerAddress().getCity().getName();
                String state = response.body().getSellerAddress().getState().getName();
                String permalink = response.body().getPermalink();

                List<String> pictures = new ArrayList<>();
                for (int i=0; i<response.body().getPictures().size(); i++){
                    String picture = response.body().getPictures().get(i).getUrl();
                    pictures.add(picture);
                }
                presenter.showResult(title,condition,price,city,state,permalink,pictures, 1);
            }

            @Override
            public void onFailure(Call<DetailModel> call, Throwable t) {

                Log.i(TAG, "onFailure: " + t.toString());
            }
        });

    }
}
