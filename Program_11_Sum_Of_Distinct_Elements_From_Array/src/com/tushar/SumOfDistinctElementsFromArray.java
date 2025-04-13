package com.tushar;

import java.util.Arrays;

//Given an array find the sum of unique elements
//Input: int[] arr = {1,6,7,8,1,1,8,8,7};
//Output: 22
public class SumOfDistinctElementsFromArray {
	public static void main(String[] args) {
		int[] arr = {1,6,7,8,1,1,8,8,7};
		int data = Arrays.stream(arr).distinct().sum();
		System.out.println(data);
	}
}
