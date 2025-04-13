package com.tushar;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

//Given a String, Find the first repeated character.
//Input: String str = "Hello World";
//Output: l
public class FindFirstRepeatedCharacter {
	public static void main(String[] args) {
		String str = "Hello World";
		
		String stringData = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet().
		stream().filter(value -> value.getValue() > 1).map(key -> key.getKey()).skip(0).findFirst().get();
		System.out.println(stringData);
		
		Character charData = str.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
		.entrySet().stream().filter(value -> value.getValue() > 1).map(key -> key.getKey()).skip(0).findFirst().get();
		System.out.println(charData);
	}
}
