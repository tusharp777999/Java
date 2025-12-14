package com.tushar.pattern;

public class Singleton1 {
    private static final Singleton1 singleton1 = new Singleton1();
    private Singleton1() {}
    public static Singleton1 getInstance(){
        return singleton1;
    }
}
