package com.example.coke.enity;

public class buy {
    private int user_id;
    private int goods_id;
    private String goods_name;
    private double unit_price;
    private int amount;
    private double price;
    private int buy_id;
    private String picture;
    private String buydate;

    @Override
    public String toString() {
        return "buy{" +
                "user_id=" + user_id +
                ", goods_id=" + goods_id +
                ", goods_name='" + goods_name + '\'' +
                ", unit_price=" + unit_price +
                ", amount=" + amount +
                ", price=" + price +
                ", buy_id=" + buy_id +
                ", picture='" + picture + '\'' +
                ", buydate='" + buydate + '\'' +
                '}';
    }

    public String getBuydate() {
        return buydate;
    }

    public void setBuydate(String buydate) {
        this.buydate = buydate;
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

    public int getBuy_id() {
        return buy_id;
    }

    public void setBuy_id(int buy_id) {
        this.buy_id = buy_id;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
