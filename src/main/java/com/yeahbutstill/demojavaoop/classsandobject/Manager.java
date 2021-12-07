package com.yeahbutstill.demojavaoop.classsandobject;

public class Manager {

    public String name;

    public Manager(String name) {
        this.name = name;
    }

    public void sayHello(String name) {
        System.out.println("Hello " + name + ", My name is Manager " + this.name);
    }

}
