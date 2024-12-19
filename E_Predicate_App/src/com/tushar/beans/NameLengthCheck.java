package com.tushar.beans;

import java.util.function.Predicate;

public class NameLengthCheck {
	public static void main(String[] args) {
		Predicate<String> predicate = name -> name.length() >=7;
		System.out.println(predicate.test("Tushar Patil"));
		System.out.println(predicate.test("Hello"));
	}
}
