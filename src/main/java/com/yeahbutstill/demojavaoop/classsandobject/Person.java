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
    public Person(String name) {
        this.name = name;
    }

    // Constructor Overloading
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Method
    public void sayHello() {
        this.sayHello("Bos");
    }
    public void sayHello(String name) {
        System.out.println("Hello " + name + ", My name is " + this.name);
    }
}
