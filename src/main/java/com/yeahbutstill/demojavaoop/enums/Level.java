package com.yeahbutstill.demojavaoop.enums;

import com.yeahbutstill.demojavaoop.codeannotation.Fancy;

@Fancy(name = "Level", tags = {"app", "java"})
public enum Level {
    STANDARD("Standard Edition"),
    PREMIUM("Premium Edition"),
    VIP("VIP Edition");

    private String description;

    Level(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
