package com.yeahbutstill.demojavaoop.classsandobject;

public class Manager extends Employee {

    public String company;

    public Manager(String name, String company) {
        super(name);
        this.company = company;
    }

    public Manager(String name) {
        super(name);
    }

    public void sayHello(String name) {
        System.out.println("Hello " + name + ", My name is Manager " + this.name);
    }

}
