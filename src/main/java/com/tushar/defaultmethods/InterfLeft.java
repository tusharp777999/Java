package com.tushar.defaultmethods;

public interface InterfLeft {
    default void m1() {
        System.out.println("I am m1() method in InterfLeft.");
    }
}
