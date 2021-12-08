package com.yeahbutstill.demojavaoop.aplikasi;

import com.yeahbutstill.demojavaoop.abstractsclasss.interfaces.Car;
import com.yeahbutstill.demojavaoop.classsandobject.Avanza;

public class CarWInterfaceApp {
    public static void main(String[] args) {
        Car car = new Avanza();
        car.drive();
        System.out.println(car.getTier());
        System.out.println(car.isMaintenance());
    }
}
