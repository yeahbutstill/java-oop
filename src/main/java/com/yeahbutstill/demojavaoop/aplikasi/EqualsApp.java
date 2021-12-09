package com.yeahbutstill.demojavaoop.aplikasi;

public class EqualsApp {
    public static void main(String[] args) {
        String firstName = "Dani";
        firstName = firstName + " " + "Setiawan";
        System.out.println(firstName);

        String lastName = "Dani Setiawan";
        System.out.println(lastName);

        System.out.println(firstName == lastName);  // false, karena ini adalah 2 object yang berbeda

        // Untuk membandingkan object
        System.out.println(firstName.equals(lastName));
    }
}
