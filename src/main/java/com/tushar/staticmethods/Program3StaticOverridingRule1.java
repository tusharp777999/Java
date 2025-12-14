package com.tushar.staticmethods;

public class Program3StaticOverridingRule1 implements InterfStatic {
    public static void m1() { //Here it seems overriding interface static method but it is separate current class method.
        System.out.println("I am Program3StaticOverridingRules static method.");
    }
    public static void main(String[] args) {
        Program3StaticOverridingRule1 program3StaticOverridingRule1 = new Program3StaticOverridingRule1();
        program3StaticOverridingRule1.m1();

        Program3StaticOverridingRule1.m1();
    }
}
