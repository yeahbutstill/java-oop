package com.yeahbutstill.demojavaoop.aplikasi;

import com.yeahbutstill.demojavaoop.data.Customer;
import com.yeahbutstill.demojavaoop.enums.Level;

public class EnumApp {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setLevel(Level.STANDARD);
        customer.setName("Dani");
        System.out.println(customer.getLevel() + " Level " + customer.getName());
        System.out.println(customer.getLevel().getDescription());

        String levelName = Level.VIP.name();
        System.out.println(levelName);

        Level level = Level.valueOf("PREMIUM");
        System.out.println(level);

        System.out.println("Print Level");
        for (var values : Level.values()) {
            System.out.println(values);
        }
    }
}
