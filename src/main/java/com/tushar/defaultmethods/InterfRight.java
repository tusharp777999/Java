package com.tushar.defaultmethods;

public interface InterfRight {
    default void m1() {
        System.out.println("I am m1() method in InterfRight.");
    }
}
