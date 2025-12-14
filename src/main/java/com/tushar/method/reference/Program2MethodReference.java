package com.tushar.method.reference;

import com.tushar.method.reference.interfacee.Interf1;

public class Program2MethodReference {
    public static void m2() {
        System.out.println("I am m2() of Program2MethodReference class!!!");
    }
    public static void main(String[] args) {
        Interf1 interf1 = Program2MethodReference::m2;
        interf1.m1();
    }
}
