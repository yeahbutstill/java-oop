package com.yeahbutstill.demojavaoop.classsandobject;

import com.yeahbutstill.demojavaoop.abstractsclasss.interfaces.Car;

public class Avanza implements Car {
    public void drive() {
        System.out.println("Dirve Avanza");
    }

    public Integer getTier() {
        return 4;
    }

    public String getBrand() {
        return "Toyota";
    }

    public boolean isMaintenance() {
        return false;
    }
}
