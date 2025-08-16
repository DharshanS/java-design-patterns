package com.dharshan.designpatterns.creational.factoryPattern;

public class VeggieBurger implements Burger {
    @Override
    public String prepare() {
        return "VeggieBurger";
    }
}
