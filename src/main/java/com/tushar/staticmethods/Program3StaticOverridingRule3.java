package com.tushar.staticmethods;

public class Program3StaticOverridingRule3 implements InterfStatic {
    private void m1() { //If it is overriding then we can't change from public to private.
        System.out.println("I am Program3StaticOverridingRules instance method.");
    }
    public static void main(String[] args) {
        Program3StaticOverridingRule3 program3StaticOverridingRule1 = new Program3StaticOverridingRule3();
        program3StaticOverridingRule1.m1();
    }
}
