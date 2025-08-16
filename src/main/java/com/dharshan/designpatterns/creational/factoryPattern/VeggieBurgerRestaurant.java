package com.dharshan.designpatterns.creational.factoryPattern;

public class VeggieBurgerRestaurant extends  Restaurant{
    @Override
    Burger createBurger() {
        return new VeggieBurger();
    }
}
