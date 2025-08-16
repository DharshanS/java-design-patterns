package com.dharshan.designpatterns.creational.abstractFactoryPattern;

public class MsiCompany extends Company{
    @Override
    public Gpu createGpu() {
        return new MsiGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }
}
