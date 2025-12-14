package com.tushar.defaultmethods;

public interface Interf {
    default void m1(){
        System.out.println("I am in Interf m1 default method.");
    }
}
