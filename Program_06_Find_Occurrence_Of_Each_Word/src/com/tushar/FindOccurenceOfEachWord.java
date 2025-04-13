package com.tushar;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindOccurenceOfEachWord {
	public static void main(String[] args) {
		String str = "I am learning Streams API in Java Java";
		Map<String, Long> mapData = Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(data -> data, Collectors.counting()));
		System.out.println(mapData);
		//Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	}
}
