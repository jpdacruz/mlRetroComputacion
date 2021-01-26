package com.example.mlretrocomputacion.data.mvp.question.clases;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/*
Model class to help with server response.
Receive all the information about the questions asked to an item
 */
public class QuestionModel {
    @SerializedName("date_created")
    @Expose
    private String dateCreated;
    @SerializedName("item_id")
    @Expose
    private String itemId;
    @SerializedName("seller_id")
    @Expose
    private Integer sellerId;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("id")
    @Expose
    private Double id;
    @SerializedName("answer")
    @Expose
    private Answer answer;

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Double getId() {
        return id;
    }

    public void setId(Double id) {
        this.id = id;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    public class Answer {
        @SerializedName("text")
        @Expose
        private String text;
        @SerializedName("status")
        @Expose
        private String status;
        @SerializedName("date_created")
        @Expose
        private String dateCreated;

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getDateCreated() {
            return dateCreated;
        }

        public void setDateCreated(String dateCreated) {
            this.dateCreated = dateCreated;
        }
    }
}
