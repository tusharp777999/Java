package com.tushar.beans;

import java.util.function.Function;

public class FunctionDemo1 {
	public static void main(String[] args) {
		Function<String, String> function1 = string -> string.toUpperCase();
		System.out.println(function1.apply("Tushar"));
		
		Function<Integer, Integer> function2 = number -> number * number;
		System.out.println(function2.apply(10));
	}
}
