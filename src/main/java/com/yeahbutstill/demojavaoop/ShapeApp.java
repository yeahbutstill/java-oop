package com.yeahbutstill.demojavaoop;

import com.yeahbutstill.demojavaoop.classsandobject.Rectangle;

public class ShapeApp {
    public static void main(String[] args) {
        var rectable = new Rectangle();
        System.out.println(rectable.getCorner());
        System.out.println(rectable.getParentCorner());
    }
}
