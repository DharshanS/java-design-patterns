package com.dharshan.designpatterns.creational;

public class Singleton<T> {

    private static volatile Singleton singletonInstance;
    private T sameData;

    private Singleton(T data) {
        this.sameData = data;
    }

    public Singleton<?> getInstance(T data) {
        Singleton<?> localInstance = singletonInstance;
        if (localInstance == null) {
            synchronized (Singleton.class) {
                localInstance = new Singleton<>(data);
            }
        }
        return localInstance;
    }


}
