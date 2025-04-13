package com.tushar;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


/*
 * Java collections like List, Set, Map, etc., only work with objects, not primitives.
 * Java's Collections and generic types (like List<T>) cannot hold primitive types (like int, double, etc.). So if you want to create a List<int>, you can’t. You have to use List<Integer> instead.
 * Streams have primitive versions (IntStream, DoubleStream, etc.) to avoid boxing overhead.
 * But when collecting into a collection (like List<Integer>), you need to box the primitives.
 * That’s why .boxed() is needed — it converts from int to Integer.
 * 
 * Arrays.stream(arr) gives you an IntStream, which is specifically for primitive int.
 * If you want to convert that IntStream into a regular Stream<Integer>, you have to box it.
 * So .boxed() wraps each int in an Integer — this is called autoboxing.
 * 
 * List<Integer> listOfIntegers = Arrays.stream(arr) // IntStream
    .boxed()                                     // converts int to Integer
    .collect(Collectors.toList());               // collects into List<Integer>

 */

//Given an array of integers, group the numbers by the range in which they belong.
//Input: int[] arr = { 2, 3, 10, 14, 20, 24, 30, 34, 40, 44, 50, 54 };
//Output: { 0 = [2, 3], 10 = [10, 14], 20 = [20, 24], 30 = [30, 34], 40 = [40, 44], 50 = [50, 54] }
public class GroupTheNumbersByTheRange {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 10, 14, 20, 24, 30, 34, 40, 44, 50, 54 };
		List<Integer> listOfIntegers = Arrays.stream(arr).boxed().collect(Collectors.toList());
		Map<Integer, List<Integer>> mapData = listOfIntegers.stream().collect(Collectors.groupingBy(input -> input/10*10, LinkedHashMap::new, Collectors.toList()));
		System.out.println(mapData);
	}
}

