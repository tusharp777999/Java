package com.tushar.beans;

public class WellWisherLambda {
	public static void wish(Greeting greeting) {
		greeting.greet();
	}
	
	public static void main(String[] args) {
		wish(() -> System.out.println("Namaskar..."));
		
		wish(() -> System.out.println("Hello, Good Morning..!!"));
	}
}
