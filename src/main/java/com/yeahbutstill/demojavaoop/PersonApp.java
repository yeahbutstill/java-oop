package com.yeahbutstill.demojavaoop;

import com.yeahbutstill.demojavaoop.classsandobject.Person;

public class PersonApp {
    public static void main(String[] args) {
        // Membuat Object
        var person1 = new Person();
        // Manipulasi Field
        person1.name = "Dani";
        person1.address = "Citayam";
        // person1.country = "Tidak bisa Diubah";
        
        Person person2 = new Person();
        Person person3;
        person3 = new Person();

        // Mengambil data
        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);
        System.out.println(person2);
        System.out.println(person3);
    }
}