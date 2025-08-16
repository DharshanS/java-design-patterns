package com.dharshan.designpatterns.creational.factoryPattern;

public class BeefBurger implements  Burger{
    @Override
    public String prepare() {
        return "BeefBurger";
    }
}
