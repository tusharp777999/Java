package com.tushar.beans;

import java.util.function.Predicate;

public class PredicateEvenCheck {
	public static void main(String[] args) {
		Predicate<Integer> predicate = i -> i % 2 == 0;
		isEvenCheck(predicate, 10);
		isEvenCheckNegate(predicate, 10);
	}
	
	public static void isEvenCheck(Predicate<Integer> predicate, Integer number) {
		System.out.print("Predicate without negate(): ");
		System.out.println(predicate.test(number));
	}
	
	public static void isEvenCheckNegate(Predicate<Integer> predicate, Integer number) {
		System.out.print("Predicate with negate(): ");
		System.out.println(predicate.negate().test(number));
	}
}
