package com.tushar;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Given a word, find the occurrence of each character.
//Input: String str = "Mississippi";
//Output: {p=2, s=4, i=4, M=1
public class NumberOfOccurrenceOfCharacter {
	public static void main(String[] args) {
		String str = "Mississippi";
		
		Map<String, Long> charOccurrence = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		//Map<String, Long> charOccurrence = Arrays.stream(str.split("")).collect(Collectors.groupingBy(x -> x, Collectors.counting()));
		System.out.println(charOccurrence);
	}
}
