package com.example.mlretrocomputacion.data.mvp.question;

import com.example.mlretrocomputacion.data.mvp.question.clases.Question;

import java.util.List;

public interface QuestionInterface {

    interface view{
        void showQuestionResult(List<Question> questions);
    }

    interface presenter {
        void showQuestionResult(List<Question> questions);
        void getItemQuestions(String idItem);
    }

    interface repository {
        void getItemQuestions(String idItem);
    }
}
