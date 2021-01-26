package com.example.mlretrocomputacion.data.remote;

import android.util.Log;

import com.example.mlretrocomputacion.data.Model.DetailModel;
import com.example.mlretrocomputacion.data.Model.QuestionModel;
import com.example.mlretrocomputacion.data.Model.UserModel;
import com.example.mlretrocomputacion.data.mvp.DetailsInterface;
import com.example.mlretrocomputacion.data.remote.RetrofitSingleton;
import com.example.mlretrocomputacion.data.utils.Utils;

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
                    //condition (new, used)
                    String condition = response.body().getCondition();
                    Double price = response.body().getPrice();
                    String city = response.body().getSellerAddress().getCity().getName();
                    String state = response.body().getSellerAddress().getState().getName();
                    String permalink = response.body().getPermalink();

                    //get list of pictures from item
                    for (int i=0; i<response.body().getPictures().size(); i++){
                        String picture = response.body().getPictures().get(i).getUrl();
                        pictures.add(picture);
                    }
                    presenter.showItemResult(title,condition,price,city,state,permalink,pictures);

                }catch (Exception e) {
                    e.printStackTrace();
                    Log.e(TAG, "Error parsing DetailModel" + e.getMessage());
                }
            }

            @Override
            public void onFailure(Call<DetailModel> call, Throwable t) {
                Log.i(TAG, "Error Call ItemDetail: " + t.toString());
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

                    //get user register since
                    String registerSinceFull;
                    registerSinceFull = response.body().getRegistrationDate();

                    //only takes the year of registration
                    String registerSince;
                    if(registerSinceFull == null || registerSinceFull.equals("")){
                        registerSince = "sin datos";
                    }else {
                        String[] parts = registerSinceFull.split("-");
                        registerSince = parts[0];
                    }

                    //get number of historical transactions
                    Integer transactions = response.body().getSellerReputation().getTransactions().getTotal();

                    /*
                    get user reputation
                    split reputation in 2 new attributes => color and number
                    if user reputation is null -> color reputation = grey number reputation = no
                     */
                    String full_reputation = response.body().getSellerReputation().getLevelId();
                    String number_reputation;
                    String color_reputation;
                    if (full_reputation == null ||full_reputation.equals("")){
                        color_reputation = "grey";
                        number_reputation ="no";
                    }else {
                        String[] parts = full_reputation.split("_");
                        number_reputation = parts[0];
                        color_reputation = parts[1];
                    }
                    Log.i(TAG, "Reputacion: " + color_reputation + number_reputation);
                    presenter.showUserResult(usuario,registerSince,transactions, number_reputation,color_reputation);

                }catch (Exception e){
                    e.printStackTrace();
                    Log.e(TAG,"Error parsing UserModel: " + e.getMessage());
                }
            }

            @Override
            public void onFailure(Call<UserModel> call, Throwable t) {
                Log.i(TAG, "Error Call UserDetail: " + t.toString());
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

                Integer totalQuestions = null;
                int respCode = response.code();
                if (respCode != 429){
                    try{
                      totalQuestions = response.body().getTotal();
                       Log.i(TAG, "TotalQuestion= " + totalQuestions);
                    }catch(Exception e){
                      e.printStackTrace();
                     Log.e(TAG,"Error parsing QuestionModel: " + e.getMessage());
                    }
                }else {
                    totalQuestions = 99999;
                }
                presenter.showQuestionResult(totalQuestions);
            }

            @Override
            public void onFailure(Call<QuestionModel> call, Throwable t) {
                Log.i(TAG, "Error Call QuestionDetail: " + t.toString());
            }
        });
    }

    /*
    check if the item is active en ML since the last visit to favorites
     */
    @Override
    public void getItemifActive(String idItem,String itemTitle) {

        Call<DetailModel> call =
                RetrofitSingleton.getInstance().getMlApiService().getDetailItem(idItem);

        call.enqueue(new Callback<DetailModel>() {
            @Override
            public void onResponse(Call<DetailModel> call, Response<DetailModel> response) {
                try{
                    String status = response.body().getStatus();
                    Log.i(TAG, "ESTADO PRODUCTOS: " + status);
                    Boolean isChecked = false;
                    //if item is ACTIVE -> item is checked
                    if (status.equals("active")){
                        isChecked = true;
                    }
                    presenter.showIfItemIsActive(isChecked, itemTitle);

                }catch (Exception e) {
                    e.printStackTrace();
                    Log.e(TAG, "Error parsing ItemIs checked" + e.getMessage());
                }
            }

            @Override
            public void onFailure(Call<DetailModel> call, Throwable t) {
                Log.i(TAG, "Error Call ItemChecked: " + t.toString());
            }
        });
    }
}
