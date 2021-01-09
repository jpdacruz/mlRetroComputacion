package com.example.mlretrocomputacion.data.Model;

public class Item {

    private String itemTitle;
    private Double itemPrice;

    public Item(String itemTitle, Double itemPrice) {
        this.itemTitle = itemTitle;
        this.itemPrice = itemPrice;
    }

    public Item() {
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public Double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }
}
