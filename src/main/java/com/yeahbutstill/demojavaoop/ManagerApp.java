package com.yeahbutstill.demojavaoop;

import com.yeahbutstill.demojavaoop.classsandobject.Employee;
import com.yeahbutstill.demojavaoop.classsandobject.Manager;
import com.yeahbutstill.demojavaoop.classsandobject.VicePresident;

public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager("Dani");
        manager.sayHello("Budi");

        var vicePresident = new VicePresident("Maya");
        vicePresident.sayHello("Dani");

        System.out.println("-------------------------------");

        // Polymorphism
        Employee employee = new Employee("Dani");
        employee.sayHello("Budi");

        employee = new Manager("Dani");
        employee.sayHello("Budi");

        employee = new VicePresident("Dani");
        employee.sayHello("Maya");

        System.out.println("=================================");

        sayHello(new Employee("Dani"));
        sayHello(new Manager("Maya"));
        sayHello(new Manager("Winda"));
    }

    // Method Polymorphism
    public static void sayHello(Employee employee) {
        System.out.println("Hello " + employee.name);
    }
}
