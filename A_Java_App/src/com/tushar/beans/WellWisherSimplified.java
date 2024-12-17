package com.tushar.beans;

public class WellWisherSimplified {
	public static void main(String[] args) {
		Greeting hindiGreeting = () -> System.out.println("Namaskar...");
		hindiGreeting.greet();
		
		Greeting englishGreeting = () -> System.out.println("Hello, Good Morning..!!");
		englishGreeting.greet();
	}
}
