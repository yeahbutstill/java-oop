package com.yeahbutstill.demojavaoop;

import com.yeahbutstill.demojavaoop.classsandobject.Manager;
import com.yeahbutstill.demojavaoop.classsandobject.VicePresident;

public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager();
        manager.name = "Dani";
        manager.sayHello("Budi");

        var vicePresident = new VicePresident();
        vicePresident.name = "Maya";
        vicePresident.sayHello("Dani");
    }
}
