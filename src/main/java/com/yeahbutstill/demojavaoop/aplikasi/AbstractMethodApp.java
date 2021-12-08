package com.yeahbutstill.demojavaoop.aplikasi;

import com.yeahbutstill.demojavaoop.abstractsclasss.Animal;
import com.yeahbutstill.demojavaoop.abstractsclasss.Cat;

public class AbstractMethodApp {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.name = "Bubu";
        animal.run();
    }
}
