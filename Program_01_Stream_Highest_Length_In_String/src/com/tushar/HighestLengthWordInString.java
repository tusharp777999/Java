package com.tushar;

import java.util.Arrays;
import java.util.Comparator;

public class HighestLengthWordInString {
	public static void main(String[] args) {
		String str = "I am learning Streams API in Java";
		String bigString = Arrays.stream(str.split(" ")).max(Comparator.comparing(String::length)).get();
		System.out.println(bigString);
	}
}
