package com.example.mlretrocomputacion.data.remote;

import android.util.Log;

import com.example.mlretrocomputacion.data.Model.DetailModel;
import com.example.mlretrocomputacion.data.Model.QuestionModel;
import com.example.mlretrocomputacion.data.Model.UserModel;
import com.example.mlretrocomputacion.data.mvp.DetailsInterface;
import com.example.mlretrocomputacion.utils.Utils;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DetailsRepository implements DetailsInterface.repository {

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

                List<String> pictures= new ArrayList<>();;

                try{
                    String title = response.body().getTitle();
                    String condition = response.body().getCondition();
                    Double price = response.body().getPrice();
                    String city = response.body().getSellerAddress().getCity().getName();
                    String state = response.body().getSellerAddress().getState().getName();
                    String permalink = response.body().getPermalink();

                    try{
                        for (int i=0; i<response.body().getPictures().size(); i++){
                            String picture = response.body().getPictures().get(i).getUrl();
                            pictures.add(picture);
                        }
                    }catch (Exception e){
                        e.printStackTrace();
                        Log.e(TAG, e.getMessage());
                    }

                    presenter.showItemResult(title,condition,price,city,state,permalink,pictures);

                }catch (Exception e) {
                    e.printStackTrace();
                    Log.e(TAG, e.getMessage());
                }
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

                try{
                    String usuario = response.body().getNickname();
                    String registerSinceFull;
                    String registerSince;
                    registerSinceFull = response.body().getRegistrationDate();

                    if(registerSinceFull != null){
                        String[] parts = registerSinceFull.split("-");
                        registerSince = parts[0];
                    }else {
                        registerSince = "sin datos";
                    }

                    Integer transactions = response.body().getSellerReputation().getTransactions().getTotal();
                    presenter.showUserResult(usuario,registerSince,transactions);

                }catch (Exception e){
                    e.printStackTrace();
                    Log.e(TAG,e.getMessage());
                }
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
                RetrofitSingleton.getInstance().getMlApiService().getQuestionItem(idItem, Utils.API_VERSION);

        call.enqueue(new Callback<QuestionModel>() {
            @Override
            public void onResponse(Call<QuestionModel> call, Response<QuestionModel> response) {

                Integer totalQuestions;

                try{
                    totalQuestions = response.body().getTotal();

                    if (totalQuestions == null){
                        totalQuestions = 0;
                    }
                    presenter.showQuestionResult(totalQuestions);

                }catch(Exception e){
                    e.printStackTrace();
                    Log.e(TAG,e.getMessage());
                }
            }

            @Override
            public void onFailure(Call<QuestionModel> call, Throwable t) {
                Log.i(TAG, "onFailure: " + t.toString());
            }
        });
    }
}
