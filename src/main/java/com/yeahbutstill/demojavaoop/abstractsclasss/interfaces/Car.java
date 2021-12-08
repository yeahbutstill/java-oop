package com.yeahbutstill.demojavaoop.abstractsclasss.interfaces;

import com.yeahbutstill.demojavaoop.classsandobject.IsMaintenance;

public interface Car extends HasBrand, IsMaintenance {

    public void drive();

    public Integer getTier();

}
