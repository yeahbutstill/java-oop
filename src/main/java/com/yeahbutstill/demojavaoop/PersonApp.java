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
        person2.name = "Maya";
        // Mengakses Method
        person2.sayHello("Dani");

        // Menggunakan Constructor dengan parameter
        Person person3;
        person3 = new Person("Maya", "Depok");
        person3.sayHello("Dani Setiawan");

        // Mengambil data
        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);
        System.out.println(person2);
        System.out.println(person3);

        var person4 = new Person("AAA", "BBB");
        System.out.println(person4.name);
        System.out.println(person4.address);
        System.out.println(person4.country);

        person4.sayHello("Budi");

        Person person5 = new Person("Budi");

        Person person6;
        person6 = new Person();
        person6.name = "Joko";
        person6.sayHello("Budi");
    }
}
