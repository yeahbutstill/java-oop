package com.yeahbutstill.demojavaoop.classsandobject;

public class Person {
    // Field
    public String name;
    public String address;
    // Field yang tidak bisa dirubah
    public final String country = "Indonesia";

    // Method
    public void sayHello(String paramName) {
        System.out.println("Hello " + paramName + ", My name is " + name);
    }
}
