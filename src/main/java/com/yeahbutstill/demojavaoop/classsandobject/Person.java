package com.yeahbutstill.demojavaoop.classsandobject;

public class Person {
    // Field
    public String name;
    public String address;
    // Field yang tidak bisa dirubah
    public final String country = "Indonesia";

    // Constructor
    public Person() {
    }

    // Constructor
    public Person(String paramName, String paramAddress) {
        this.name = paramName;
        this.address = paramAddress;
    }

    // Method
    public void sayHello(String paramName) {
        System.out.println("Hello " + paramName + ", My name is " + name);
    }
}
