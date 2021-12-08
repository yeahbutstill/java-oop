package com.yeahbutstill.demojavaoop.data;

public class Product {

    protected String name;
    protected Integer price;

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
