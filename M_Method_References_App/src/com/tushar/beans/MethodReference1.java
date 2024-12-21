package com.tushar.beans;

import java.util.function.Consumer;

public class MethodReference1 {
	public static void main(String[] args) {
		Consumer<String> consumer = c -> System.out.println(c);
		consumer.accept("Hello");
		
		Consumer<String> consumerMethodReference = System.out::println;
		consumer.accept("Hello Reference");
	}
}
