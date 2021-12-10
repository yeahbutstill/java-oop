package com.yeahbutstill.demojavaoop.aplikasi;

import com.yeahbutstill.demojavaoop.abstractsclasss.interfaces.HelloWorld;

public class HelloWorldApp {
    public static void main(String[] args) {
        // Contoh Anonymous Class
        HelloWorld english = new HelloWorld() {
            @Override
            public void sayHello() {
                System.out.println("Hello");
            }

            @Override // Anotation
            public void sayHello(String name) {
                System.out.println("Hello " + name);
            }
        };

        // Contoh Anonymous Class
        HelloWorld indonesia = new HelloWorld() {
            @Override
            public void sayHello() {
                System.out.println("Halo");
            }

            @Override // Anotation
            public void sayHello(String name) {
                System.out.println("Halo " + name);
            }
        };

        english.sayHello();
        english.sayHello("Dani");
        indonesia.sayHello();
        indonesia.sayHello("Maya");

    }
}
