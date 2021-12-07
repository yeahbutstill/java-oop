package com.yeahbutstill.demojavaoop;

import com.yeahbutstill.demojavaoop.classsandobject.Manager;
import com.yeahbutstill.demojavaoop.classsandobject.VicePresident;

public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager("Dani");
        manager.sayHello("Budi");

        var vicePresident = new VicePresident("Maya");
        vicePresident.sayHello("Dani");
    }
}
