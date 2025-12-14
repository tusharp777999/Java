package com.tushar.staticmethods;

public class Program3StaticOverridingRule2 implements InterfStatic {
    public void m1() { //If it is overridden then we removed the static here we have to get the error if it is overriding.
        System.out.println("I am Program3StaticOverridingRules instance method.");
    }
    public static void main(String[] args) {
        Program3StaticOverridingRule2 program3StaticOverridingRule1 = new Program3StaticOverridingRule2();
        program3StaticOverridingRule1.m1();
    }
}
