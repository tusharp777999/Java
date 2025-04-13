package com.tushar;

import java.util.Arrays;

public class PrintNoOfVowelsMatchWords {
	public static void main(String[] args) {
		String str = "I am learning Streams API in Java";
		Arrays.stream(str.split(" ")).filter(data -> data.replaceAll("[^aeiouAEIOU]", "").length() == 2).forEach(System.out::println);
	}
}
