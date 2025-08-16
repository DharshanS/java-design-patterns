package com.dharshan.designpatterns.creational.abstractFactoryPattern;

public class MsiGpu  implements Gpu{
    @Override
    public String createGpu() {
        return "MsiGpu";
    }
}
