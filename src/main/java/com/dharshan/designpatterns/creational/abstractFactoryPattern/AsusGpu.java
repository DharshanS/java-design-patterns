package com.dharshan.designpatterns.creational.abstractFactoryPattern;

public class AsusGpu implements  Gpu{
    @Override
    public String createGpu() {
        return "AsusGpu";
    }
}
