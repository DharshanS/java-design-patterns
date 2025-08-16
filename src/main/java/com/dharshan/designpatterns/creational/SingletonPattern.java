package com.dharshan.designpatterns.creational;

public class SingletonPattern<T> {

    private static volatile SingletonPattern<?> singletonInstance;
    private T sameData;

    private SingletonPattern(T data) {
        this.sameData = data;
    }

    public SingletonPattern<?> getInstance(T data) {
        SingletonPattern<?> localInstance = singletonInstance;
        if (localInstance == null) {
            synchronized (SingletonPattern.class) {
                localInstance = new SingletonPattern<>(data);
            }
        }
        return localInstance;
    }


}
