package com.tushar;

import java.util.Arrays;

public class RemoveDuplicatesFromStringReturnInSameOrder {
	public static void main(String[] args) {
		String str = "dabcadefg";
		str.chars().distinct().mapToObj(data -> (char) data).forEach(System.out::print);//Approach 1
		System.out.println();
		System.out.println("===================================================");
		Arrays.stream(str.split("")).distinct().forEach(System.out::print);//Approach 2
	}
}
