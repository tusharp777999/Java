package com.tushar;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Given a List of integers, divide it into two lists one is having an even number and other having an odd number
//Input: int[] arr = {1,2,3,4,5,6,7,8};
//Output: [[1,3,5,7][2,4,6,8]]
public class PrintEvenAndOddListInSingleList {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

		List<List<Integer>> collectedData = list.stream()
				.collect(Collectors.groupingBy(data -> data % 2 == 0, Collectors.toList())).entrySet().stream()
				.map(data -> data.getValue()).collect(Collectors.toList());

		// partitioningBy uses Predicate and groupingBy uses a Function
		// List<List<Integer>> collectedData = list.stream().collect(Collectors.partitioningBy(data -> data%2 == 0,
		// Collectors.toList())).entrySet().stream().map(data -> data.getValue()).collect(Collectors.toList());

		System.out.println(collectedData);
	}
}
