package com.example.coke.enity;

public class shoppingCar {
    private int goods_id;
    private String goods_name;
    private boolean onsale;
    private double unit_price;
    private int amount;
    private double price;
    private int user_id;
    private int car_id;
    private String picture;

    @Override
    public String toString() {
        return "shoppingCar{" +
                "goods_id=" + goods_id +
                ", goods_name='" + goods_name + '\'' +
                ", onsale=" + onsale +
                ", unit_price=" + unit_price +
                ", amount=" + amount +
                ", price=" + price +
                ", user_id=" + user_id +
                ", car_id=" + car_id +
                ", picture='" + picture + '\'' +
                '}';
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
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

    public boolean isOnsale() {
        return onsale;
    }

    public void setOnsale(boolean onsale) {
        this.onsale = onsale;
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

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getCar_id() {
        return car_id;
    }

    public void setCar_id(int car_id) {
        this.car_id = car_id;
    }
}
