package com.yeahbutstill.demojavaoop.classsandobject;

public class Person {
    // Field yang tidak bisa dirubah
    public final String country = "Indonesia";
    // Field
    public String name;
    public String address;

    // Constructor
    public Person() {
    }

    // Constructor Overloading
    public Person(String paramName) {
        this.name = paramName;
    }

    // Constructor Overloading
    public Person(String paramName, String paramAddress) {
        this.name = paramName;
        this.address = paramAddress;
    }

    // Method
    public void sayHello(String paramName) {
        System.out.println("Hello " + paramName + ", My name is " + name);
    }
}
