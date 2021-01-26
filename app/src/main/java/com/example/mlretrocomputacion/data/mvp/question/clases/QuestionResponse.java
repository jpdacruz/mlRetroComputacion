package com.example.mlretrocomputacion.data.mvp.question.clases;

import com.example.mlretrocomputacion.data.mvp.question.clases.QuestionModel;

import java.util.List;

public class QuestionResponse {
    private List<QuestionModel> questions;

    public List<QuestionModel> getQuestions() {
        return questions;
    }
    public void setQuestionResults(List<QuestionModel> results) {
        this.questions = questions;
    }
}
