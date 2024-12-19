package com.tushar.beans;

import java.util.function.BiFunction;

public class BiFunctionDemo1 {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> biFunction1 = (number1, number2) -> (number1 * number2);
		System.out.println(biFunction1.apply(10, 20));
	}
}
