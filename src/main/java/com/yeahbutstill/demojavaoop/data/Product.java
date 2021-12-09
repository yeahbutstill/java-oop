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

    public String toString() {
        return "Product name: " + name +
                ", price: " + price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;

        Product product = (Product) o;

        if (!getName().equals(product.getName())) return false;
        return getPrice().equals(product.getPrice());
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getPrice().hashCode();
        return result;
    }
}
