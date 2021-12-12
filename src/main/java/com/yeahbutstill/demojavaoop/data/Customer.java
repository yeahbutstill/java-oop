package com.yeahbutstill.demojavaoop.data;

import com.yeahbutstill.demojavaoop.enums.Level;

public class Customer {
    private Level level;
    private String name;

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
