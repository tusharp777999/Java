package com.tushar.defaultmethods;

public class Program2Overridden implements Interf{

    public void m1(){
        System.out.println("I am overridden interf m1() method.");
    }

    public static void main(String[] args) {
        Program2Overridden program2Overridden = new Program2Overridden();
        program2Overridden.m1();
    }
}
