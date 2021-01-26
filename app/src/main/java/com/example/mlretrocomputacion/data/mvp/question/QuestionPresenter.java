package com.example.mlretrocomputacion.data.mvp.question;


import com.example.mlretrocomputacion.data.mvp.question.clases.Question;

import java.util.List;

public class QuestionPresenter implements QuestionInterface.presenter {
    private QuestionInterface.view view;
    private QuestionInterface.repository model;


    public QuestionPresenter(QuestionInterface.view view) {
        this.view = view;
        this.model = new QuestionRepository(this);
    }

    @Override
    public void showQuestionResult(List<Question> questions, int error) {
        if (view!=null){
            view.showQuestionResult(questions, error);
        }
    }

    @Override
    public void getItemQuestions(String idItem) {
        if (view!=null){
            model.getItemQuestions(idItem);
        }
    }
}
