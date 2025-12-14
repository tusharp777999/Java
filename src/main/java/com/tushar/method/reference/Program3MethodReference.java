package com.tushar.method.reference;

import com.tushar.method.reference.interfacee.Interf2;

public class Program3MethodReference {
    public static int m2(String str1) {
        return str1.length();
    }
    public static void main(String[] args) {
        Interf2 interf2 = Program3MethodReference::m2;
        System.out.println(interf2.m1("Tushar"));
    }
}
