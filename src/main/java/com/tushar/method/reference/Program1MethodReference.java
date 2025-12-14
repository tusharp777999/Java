package com.tushar.method.reference;

import com.tushar.method.reference.interfacee.Interf1;

public class Program1MethodReference {
    public static void main(String[] args) {
        Interf1 interf1 = () -> System.out.println("I am Interf m1()!!!");
        interf1.m1();
    }
}
