package com.yeahbutstill.demojavaoop.aplikasi;

import com.yeahbutstill.demojavaoop.getterdansetter.Category;

public class CategoryApp {
    public static void main(String[] args) {

        var category = new Category();
        System.out.println(category.getId());
        System.out.println(category.getName());
        System.out.println(category.getPrice());
        System.out.println(category.isExpensive());

    }
}
