package com.veracity;

import java.util.Arrays;
import java.util.Comparator;

public class FindSecondHighestLengthWord {
	public static void main(String[] args) {
		String str = "I am learning streams API in Java";
		String data = Arrays.stream(str.split(" ")).sorted(Comparator.comparing(String::length).reversed()).skip(1).findFirst().get();
		System.out.println(data);
	}
}
