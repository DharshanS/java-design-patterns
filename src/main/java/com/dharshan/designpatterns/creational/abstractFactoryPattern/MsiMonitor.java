package com.dharshan.designpatterns.creational.abstractFactoryPattern;

public class MsiMonitor implements  Monitor{
    @Override
    public String createMonitor() {
        return "MsiMonitor";
    }
}
