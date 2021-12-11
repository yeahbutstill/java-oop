package com.yeahbutstill.demojavaoop.aplikasi;

import com.yeahbutstill.demojavaoop.data.Customer;
import com.yeahbutstill.demojavaoop.enums.Level;

public class EnumApp {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.level = Level.STANDARD;
        System.out.println(customer.level);
    }
}
