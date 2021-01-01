package com.example.coke.enity;

public class sold {
    private int user_id;
    private int goods_id;
    private String goods_name;
    private double unit_price;
    private int amount;
    private double price;
    private int sold_id;
    private String picture;
    private String solddate;

    @Override
    public String toString() {
        return "sold{" +
                "user_id=" + user_id +
                ", goods_id=" + goods_id +
                ", goods_name='" + goods_name + '\'' +
                ", unit_price=" + unit_price +
                ", amount=" + amount +
                ", price=" + price +
                ", sold_id=" + sold_id +
                ", picture='" + picture + '\'' +
                ", solddate='" + solddate + '\'' +
                '}';
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(int goods_id) {
        this.goods_id = goods_id;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public double getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(double unit_price) {
        this.unit_price = unit_price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSold_id() {
        return sold_id;
    }

    public void setSold_id(int sold_id) {
        this.sold_id = sold_id;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getSolddate() {
        return solddate;
    }

    public void setSolddate(String solddate) {
        this.solddate = solddate;
    }
}
