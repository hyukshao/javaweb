package com.example.coke.enity;

public class goods {
    private int id;
    private String name;
    private String type;
    private double oldPrice;
    private double newPrice;
    private int sellerId;
    private int amount;
    private String picture;
    private int buyYear;
    private int buyMonth;
    private int buyDay;
    private String sellerWords;
    private boolean onsale;

    @Override
    public String toString() {
        return "goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", oldPrice=" + oldPrice +
                ", newPrice=" + newPrice +
                ", sellerId=" + sellerId +
                ", amount=" + amount +
                ", picture='" + picture + '\'' +
                ", buyYear=" + buyYear +
                ", buyMonth=" + buyMonth +
                ", buyDay=" + buyDay +
                ", sellerWords='" + sellerWords + '\'' +
                ", onsale=" + onsale +
                '}';
    }

    public boolean isOnsale() {
        return onsale;
    }

    public void setOnsale(boolean onsale) {
        this.onsale = onsale;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(double oldPrice) {
        this.oldPrice = oldPrice;
    }

    public double getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(double newPrice) {
        this.newPrice = newPrice;
    }

    public int getSellerId() {
        return sellerId;
    }

    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public int getBuyYear() {
        return buyYear;
    }

    public void setBuyYear(int buyYear) {
        this.buyYear = buyYear;
    }

    public int getBuyMonth() {
        return buyMonth;
    }

    public void setBuyMonth(int buyMonth) {
        this.buyMonth = buyMonth;
    }

    public int getBuyDay() {
        return buyDay;
    }

    public void setBuyDay(int buyDay) {
        this.buyDay = buyDay;
    }

    public String getSellerWords() {
        return sellerWords;
    }

    public void setSellerWords(String sellerWords) {
        this.sellerWords = sellerWords;
    }

}
