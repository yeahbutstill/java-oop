package com.yeahbutstill.demojavaoop;

import com.yeahbutstill.demojavaoop.classsandobject.Car;

import java.util.Date;

public class CarApp {
    public static void main(String[] args) {
        // Membuat Object
        var car1 = new Car();
        // Manipulasi Field
        car1.name = "Avanza";
        car1.brand = "Toyota";

        Car car2 = new Car();
        car2.name = "Kijang Capsul";
        // Mengakses Method
        car2.startEngine(new Date());

        // Menggunakan Constructor dengan parameter
        Car car3;
        car3 = new Car("Brio", "Honda");
        car3.startEngine(new Date());

        // Mengambil data
        System.out.println(car1.name);
        System.out.println(car1.brand);
        System.out.println(car2);
        System.out.println(car3);

        var car4 = new Car("Rush", "Toyota");
        System.out.println(car4.name);
        System.out.println(car4.brand);

        car4.stopEngine(new Date());

        Car car5 = new Car("Hyundai");

        Car car6;
        car6 = new Car();
        car6.name = "Supra RX 8";
        car6.stopEngine(new Date());
    }
}
