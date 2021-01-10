package com.example.mlretrocomputacion.data.mvp;

import android.util.Log;

import com.example.mlretrocomputacion.data.Model.DetailModel;
import com.example.mlretrocomputacion.data.Model.QuestionModel;
import com.example.mlretrocomputacion.data.Model.UserModel;
import com.example.mlretrocomputacion.data.remote.MlApiService;
import com.example.mlretrocomputacion.data.remote.RetrofitSingleton;
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

public class DetailsRepository implements DetailsInterface.repository{

    private static final String TAG = "DetailsModel";
    private DetailsInterface.presenter presenter;

    public DetailsRepository(DetailsInterface.presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void getItemDetails(String idItem) {

        Call<DetailModel> call =
                RetrofitSingleton.getInstance().getMlApiService().getDetailItem(idItem);

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
                presenter.showItemResult(title,condition,price,city,state,permalink,pictures);
            }

            @Override
            public void onFailure(Call<DetailModel> call, Throwable t) {

                Log.i(TAG, "onFailure: " + t.toString());
            }
        });
    }

    @Override
    public void getUserDetails(Integer idUser) {

        Call<UserModel> call =
                RetrofitSingleton.getInstance().getMlApiService().getDetailUser(idUser);

        call.enqueue(new Callback<UserModel>() {
            @Override
            public void onResponse(Call<UserModel> call, Response<UserModel> response) {

                String usuario = response.body().getNickname();

                String registerSinceFull = response.body().getRegistrationDate();
                String[] parts = registerSinceFull.split("-");
                String registerSince = parts[0];

                Integer transactions = response.body().getSellerReputation().getTransactions().getTotal();
                presenter.showUserResult(usuario,registerSince,transactions);
            }

            @Override
            public void onFailure(Call<UserModel> call, Throwable t) {
                Log.i(TAG, "onFailure: " + t.toString());
            }
        });
    }

    @Override
    public void getItemQuestions(String idItem) {

        Call<QuestionModel> call =
                RetrofitSingleton.getInstance().getMlApiService().getQuestionItem(idItem,Constants.API_VERSION);

        call.enqueue(new Callback<QuestionModel>() {
            @Override
            public void onResponse(Call<QuestionModel> call, Response<QuestionModel> response) {

                int totalQuestions = response.body().getTotal();
                presenter.showQuestionResult(totalQuestions);
            }

            @Override
            public void onFailure(Call<QuestionModel> call, Throwable t) {
                Log.i(TAG, "onFailure: " + t.toString());
            }
        });
    }
}
