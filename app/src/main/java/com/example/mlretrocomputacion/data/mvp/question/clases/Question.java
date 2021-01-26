package com.example.mlretrocomputacion.data.mvp.question.clases;

public class Question {
    private String Question;
    private String answerd;
    private String status;

    public Question(String question, String answerd, String status) {
        Question = question;
        this.answerd = answerd;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }

    public String getAnswerd() {
        return answerd;
    }

    public void setAnswerd(String answerd) {
        this.answerd = answerd;
    }
}
