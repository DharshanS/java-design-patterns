package com.dharshan.designpatterns.creational.factoryPattern;

public abstract class Restaurant {

    public Burger orderBurger() {
        Burger burger = createBurger();
        burger.prepare();
        return burger;
    }

    abstract Burger createBurger();

}
