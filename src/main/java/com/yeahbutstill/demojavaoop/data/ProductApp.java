package com.yeahbutstill.demojavaoop.data;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product();
        product.name = "Indomie"; // bisa diakses karena di package yang sama
        product.price = 3500; // bisa diakses karena di package yang sama

        System.out.println(product.getName());
        System.out.println(product.getPrice());

        System.out.println(product);

        Product product1 = new Product();
        product.name = "Sarmidu";
        product.price = 4000;

        Product product2 = new Product();
        product.name = "Sarmidu";
        product.price = 4000;

        System.out.println(product.equals(product1));
        System.out.println(product1.equals(product2));
        System.out.println(product1.hashCode() == product2.hashCode());
    }
}
