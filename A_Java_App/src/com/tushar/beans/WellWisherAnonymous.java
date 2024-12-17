package com.tushar.beans;

public class WellWisherAnonymous {
	
	public static void wish(Greeting greeting) {
		greeting.greet();
	}
	
	public static void main(String[] args) {
		wish(new Greeting() {
			@Override
			public void greet() {
				System.out.println("Namaskar...");
			}
		});
		
		wish(new Greeting() {
			@Override
			public void greet() {
				System.out.println("Hello, Good Morning..!!");
			}
		});
	}
}
