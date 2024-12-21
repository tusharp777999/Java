package com.tushar.beans;

public class Test {
	
	public static void m2() {
		System.out.println("This is m2() method...");
	}
	
	public static void main(String[] args) {
		MyInterface myInterface = () -> System.out.println("This is m1() method...");
		myInterface.m1();
		
		MyInterface myInterface1 = Test::m2;
		myInterface1.m1();
	}
}

interface MyInterface {
	void m1();
} 