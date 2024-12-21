package com.tushar.beans;

import java.util.stream.Stream;

public class NumbersFilter {
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(4, 8, 12, 6, 7, 11, 24);
		//stream.forEach(System.out::println);
		//stream.filter(number -> number >= 6).forEach(System.out::println);
		Stream<Integer> filteredStream = stream.filter(number -> number >= 6);
		filteredStream.forEach(System.out::println);
	}
}
