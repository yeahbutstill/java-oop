package com.yeahbutstill.demojavaoop.aplikasi;

import com.yeahbutstill.demojavaoop.staticfield.Country.City;

import static com.yeahbutstill.demojavaoop.staticfield.Application.PROCESSOR;
import static com.yeahbutstill.demojavaoop.staticfield.Constant.APPLICATION;
import static com.yeahbutstill.demojavaoop.staticfield.Constant.VERSION;
import static com.yeahbutstill.demojavaoop.staticfield.MathUtil.sum;

public class StatiacMembers {
    public static void main(String[] args) {
        // Memanggil Static Members
        System.out.println(PROCESSOR);

        System.out.println(APPLICATION);
        System.out.println(VERSION);

        System.out.println(sum(1, 2, 3, 4));

        City city = new City();
        city.setName("Indonesia");
        System.out.println(city.getName());
    }
}
