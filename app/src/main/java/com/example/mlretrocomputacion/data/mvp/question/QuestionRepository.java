package com.example.mlretrocomputacion.data.mvp.question;

import android.util.Log;

import com.example.mlretrocomputacion.data.mvp.question.clases.Question;
import com.example.mlretrocomputacion.data.mvp.question.clases.QuestionResponse;
import com.example.mlretrocomputacion.data.remote.RetrofitSingleton;
import com.example.mlretrocomputacion.data.utils.Utils;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class QuestionRepository implements QuestionInterface.repository{

    private static final String TAG = "QuestionRepository";
    private QuestionInterface.presenter presenter;
    private List<Question> listQuestions;

    public QuestionRepository(QuestionInterface.presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void getItemQuestions(String idItem) {
        listQuestions = new ArrayList<>();
        Call<QuestionResponse> call =
                RetrofitSingleton.getInstance().getMlApiService().getQuestionItem(idItem, Utils.API_VERSION);

        call.enqueue(new Callback<QuestionResponse>() {
            @Override
            public void onResponse(Call<QuestionResponse> call, Response<QuestionResponse> response) {

                int respCode = response.code();
                Log.i(TAG, "CODE RESPONSE: " + respCode);
                if (respCode != 429) {
                    try {
                        int responseSize =response.body().getQuestions().size();
                        Log.i(TAG, "CODE RESPONSE SIZE: " + responseSize);
                        if (responseSize != 0){
                            for (int i = 0; i < responseSize; i++) {
                                String mQuestion = response.body().getQuestions().get(i).getText();
                                String mStatus = response.body().getQuestions().get(i).getStatus();
                                String mAnswerd = response.body().getQuestions().get(i).getAnswer().getText();
                                Question question = new Question(mQuestion, mAnswerd,mStatus);
                                listQuestions.add(question);
                            }
                        }else {
                            Question question = new Question("No hay preguntas realizadas", "","");
                            listQuestions.add(question);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        Log.e(TAG, "Error parsing QuestionModel: " + e.getMessage());
                    }
                }
                presenter.showQuestionResult(listQuestions);
            }

            @Override
            public void onFailure(Call<QuestionResponse> call, Throwable t) {
                Log.i(TAG, "Error Call QuestionDetail: " + t.toString());
            }
        });
    }
}
