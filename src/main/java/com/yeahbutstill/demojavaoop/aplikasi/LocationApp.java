package com.yeahbutstill.demojavaoop.aplikasi;

import com.yeahbutstill.demojavaoop.abstractsclasss.City;
import com.yeahbutstill.demojavaoop.abstractsclasss.Location;

public class LocationApp {
    public static void main(String[] args) {
        // var location = new Location(); // error
        var city = new City();
        city.name = "Jakarta";

        System.out.println(city.name);
    }
}
