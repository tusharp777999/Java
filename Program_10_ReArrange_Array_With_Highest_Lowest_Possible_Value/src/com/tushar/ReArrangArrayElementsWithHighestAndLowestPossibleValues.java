package com.tushar;

import java.util.Arrays;
import java.util.Collections;

//Given an int[] array, re-arrange the elements to form the highest/lowest possible value
//Input: int[] arr = {1, 2, 3, 4, 5};
//Output: `54321 / 12345
public class ReArrangArrayElementsWithHighestAndLowestPossibleValues {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		Arrays.stream(arr).mapToObj(data -> data).sorted().forEach(System.out::print);
		System.out.println();
		Arrays.stream(arr).mapToObj(data -> data).sorted(Collections.reverseOrder()).forEach(System.out::print);
	}
}
