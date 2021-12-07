package com.yeahbutstill.demojavaoop.aplikasi;

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
        sayHello(new VicePresident("Winda"));
    }

    // Method Polymorphism
    public static void sayHello(Employee employee) {
        // Type Check & Casts
        if (employee instanceof VicePresident) {
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP " + vicePresident.name);
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello " + employee.name);
        }
    }
}
