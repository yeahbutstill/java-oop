package com.yeahbutstill.demojavaoop.data;

import com.yeahbutstill.demojavaoop.data.Product;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product();
        product.name = "Indomie"; // bisa diakses karena di package yang sama
        product.price = 3500; // bisa diakses karena di package yang sama

        System.out.println(product.getName());
        System.out.println(product.getPrice());
    }
}
