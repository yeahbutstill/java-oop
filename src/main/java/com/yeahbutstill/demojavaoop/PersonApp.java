package com.yeahbutstill.demojavaoop;

import com.yeahbutstill.demojavaoop.classsandobject.Person;

public class PersonApp {
    public static void main(String[] args) {
        // Membuat Object
        var person1 = new Person();
        Person person2 = new Person();
        Person person3;
        person3 = new Person();

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
    }
}
