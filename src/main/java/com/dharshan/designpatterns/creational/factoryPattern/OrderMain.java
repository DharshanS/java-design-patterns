package com.dharshan.designpatterns.creational.factoryPattern;

public class OrderMain {

    public static void main(String[] args) {
        Restaurant beefBurger = new BeefBurgerRestaurant();
        beefBurger.orderBurger();

        Restaurant veggieBurger = new VeggieBurgerRestaurant();
        veggieBurger.orderBurger();
    }
}
