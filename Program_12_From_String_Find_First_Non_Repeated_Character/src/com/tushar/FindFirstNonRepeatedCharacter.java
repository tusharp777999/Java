package com.tushar;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Given a string, find the first non repeated character.
//Input: String str = "Hello World";
//Output: H
public class FindFirstNonRepeatedCharacter {
	public static void main(String[] args) {
		String str = "Hello World";
		String data = Arrays.stream(str.split("")).filter(input -> str.indexOf(input) == str.lastIndexOf(input)).findFirst().get();
		System.out.println(data);
		
		Map<Character, Long> mapData = str.chars().mapToObj(input -> (char) input).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		System.out.println(mapData);
		
		Character charData = mapData.entrySet().stream().filter(value -> value.getValue() == 1).map(key -> key.getKey()).skip(1).findFirst().get();
		System.out.println(charData);
	}
}
