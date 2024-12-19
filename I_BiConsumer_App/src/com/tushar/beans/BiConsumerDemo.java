package com.tushar.beans;

import java.util.function.BiConsumer;

public class BiConsumerDemo {
	public static void main(String[] args) {
		BiConsumer<String, String> biConsumer = (string1, string2) -> {
			System.out.println("Hi, I am " + string1);
			System.out.println("I am from " + string2);
		};
		
		biConsumer.accept("Tushar", "Pune");
	}
}
