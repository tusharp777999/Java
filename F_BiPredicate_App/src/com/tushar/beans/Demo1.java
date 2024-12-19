package com.tushar.beans;

import java.util.function.BiPredicate;

public class Demo1 {
	public static void main(String[] args) {
		BiPredicate<Integer, Integer> biPredicate = (number1, number2) -> ((number1 + number2) >= 100);
		System.out.println(biPredicate.test(10, 200));
	}
}
