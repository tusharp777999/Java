package com.tushar;

import java.util.Arrays;
import java.util.Comparator;

public class FindSecondHighestWordLength {
	public static void main(String[] args) {
		String str = "I am learning Streams API in Java";
		int lengthOfString = Arrays.stream(str.split(" ")).map(len -> len.length()).sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(lengthOfString);
	}
}
