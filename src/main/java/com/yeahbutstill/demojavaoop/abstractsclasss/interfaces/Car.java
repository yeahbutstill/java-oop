package com.yeahbutstill.demojavaoop.abstractsclasss.interfaces;

import com.yeahbutstill.demojavaoop.classsandobject.IsMaintenance;
import com.yeahbutstill.demojavaoop.codeannotation.Fancy;

@Fancy(name = "Car", tags = {"app", "java"})
public interface Car extends HasBrand, IsMaintenance {

    public void drive();

    public Integer getTier();

    // default method
    default boolean isBig() {
        return false;
    }

}
