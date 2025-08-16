package com.dharshan.designpatterns.creational.factoryPattern;

public class BeefBurgerRestaurant extends  Restaurant {
    @Override
    Burger createBurger() {
        return new BeefBurger();
    }
}
