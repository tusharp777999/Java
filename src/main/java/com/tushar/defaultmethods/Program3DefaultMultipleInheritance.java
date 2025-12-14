package com.tushar.defaultmethods;

public class Program3DefaultMultipleInheritance implements InterfLeft, InterfRight{

    @Override
    public void m1() {
        //System.out.println("Parent overridden the method."); //Solution 1
        InterfLeft.super.m1();//Particular interface method logic
        InterfRight.super.m1();
    }

    public static void main(String[] args) {
        Program3DefaultMultipleInheritance program3DefaultMultipleInheritance = new Program3DefaultMultipleInheritance();
        program3DefaultMultipleInheritance.m1();
    }
}
