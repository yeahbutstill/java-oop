package com.yeahbutstill.demojavaoop.aplikasi;

import com.yeahbutstill.demojavaoop.abstractsclasss.City;

public class LocationApp {
    public static void main(String[] args) {
        // var location = new Location(); // error
        var city = new City();
        city.name = "Jakarta";

        System.out.println(city.name);
    }
}
