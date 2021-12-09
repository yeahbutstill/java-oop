package com.yeahbutstill.demojavaoop.classsandobject;

import com.yeahbutstill.demojavaoop.abstractsclasss.interfaces.Car;

public class Bus implements Car {

    public void drive() {
        System.out.println("Bus drive");
    }

    public Integer getTier() {
        return 8;
    }

    public String getBrand() {
        return "Hino";
    }

    public boolean isMaintenance() {
        return false;
    }
    
    public boolean isBig() {
        return true;
    }
}
