package com.dharshan.designpatterns.creational.abstractFactoryPattern;

public class AsusMonitor implements Monitor{
    @Override
    public String createMonitor() {
        return "AusMonitor";
    }
}
