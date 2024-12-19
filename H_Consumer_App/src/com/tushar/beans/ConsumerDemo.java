package com.tushar.beans;

import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String[] args) {
		Consumer<String> consumer = (name) -> System.out.println("Good Morning!!!");
	}
}
