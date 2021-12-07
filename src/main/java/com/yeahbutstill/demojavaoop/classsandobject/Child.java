package com.yeahbutstill.demojavaoop.classsandobject;

public class Child extends Parent {

    public String name;

    public void doIt() {
        System.out.println("Do it from child");
        System.out.println("Parent name is " + super.name);
    }

}
