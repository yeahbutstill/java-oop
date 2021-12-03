package com.yeahbutstill.demojavaoop.classsandobject;

import java.util.Date;

public class Car {
    public String name;
    public String brand;

    public Car(String paramName, String paramBrand) {
        this.name = paramName;
        this.brand = paramBrand;
    }

    // Memanggil Constructor Lain
    public Car(String paramName) {
        this(paramName, null);
    }

    public Car() {
        this(null);
    }

    public void startEngine(Date paramStartEngine) {
        System.out.println(name + ", " + brand + ", Status Engine : ON " + paramStartEngine);
    }

    public void stopEngine(Date paramStopEngine) {
        System.out.println(name + ", " + brand + ", Status Engine : OFF " + paramStopEngine);
    }
}
