package com.yeahbutstill.demojavaoop.classsandobject;

public class Rectangle extends Shape {
    public Integer getCorner() {
        return 4;
    }

    public Integer getParentCorner() {
        return super.getCorner();
    }
}
