package com.yeahbutstill.demojavaoop.classsandobject;

public class Employee {
    public String name;

    public Employee(String name) {
        this.name = name;
    }

    public void sayHello(String name) {
        System.out.println("Hi " + name + ", My name is Employee " + this.name);
    }
}
