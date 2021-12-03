package com.yeahbutstill.demojavaoop.classsandobject;

import java.util.Date;

public class Car {
    public String name;
    public String brand;

    public Car(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    // Memanggil Constructor Lain
    public Car(String name) {
        this(name, null);
    }

    public Car() {
        this(null);
    }

    public void startEngine(Date paramEngine) {
        System.out.println(name + ", " + brand + ", Status Engine : ON " + paramEngine);
    }

    public void stopEngine(Date paramEngine) {
        System.out.println(name + ", " + brand + ", Status Engine : OFF " + paramEngine);
    }
}
