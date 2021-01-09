package com.example.mlretrocomputacion.data.Model;

public class Item {

    private String itemTitle;
    private Double itemPrice;
    private String thumbnail;
    private String level_reputation;
    private String color_reputacion;
    private Integer idUser;
    private String idItem;

    public Item(String itemTitle, Double itemPrice,String thumbnail, String level_reputation, String color_reputacion) {
        this.itemTitle = itemTitle;
        this.itemPrice = itemPrice;
        this.thumbnail = thumbnail;
        this.level_reputation = level_reputation;
        this.color_reputacion = color_reputacion;
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

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getLevel_reputation() {
        return level_reputation;
    }

    public void setLevel_reputation(String level_reputation) {
        this.level_reputation = level_reputation;
    }

    public String getColor_reputacion() {
        return color_reputacion;
    }

    public void setColor_reputacion(String color_reputacion) {
        this.color_reputacion = color_reputacion;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getIdItem() {
        return idItem;
    }

    public void setIdItem(String idItem) {
        this.idItem = idItem;
    }
}
