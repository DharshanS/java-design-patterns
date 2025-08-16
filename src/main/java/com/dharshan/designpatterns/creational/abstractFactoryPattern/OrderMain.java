package com.dharshan.designpatterns.creational.abstractFactoryPattern;

public class OrderMain {
    public static void main(String[] args) {
        MsiCompany company = new MsiCompany();
        company.createMonitor();
        company.createGpu();

        AsusCompany asusCompany = new AsusCompany();
        asusCompany.createGpu();
        asusCompany.createMonitor();
    }
}
