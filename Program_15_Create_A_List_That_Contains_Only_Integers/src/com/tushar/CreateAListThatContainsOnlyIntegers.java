package com.tushar;

import java.util.Arrays;
import java.util.List;

/*
 *Given a list of strings, create a list that contains only integers.
 *Input: String[] s = {"abc", "123", "456", "xyz"};
 *Output: [123, 456]
*/
public class CreateAListThatContainsOnlyIntegers {
	public static void main(String[] args) {
		String[] str = {"abc", "123", "456", "xyz"};
		List<Integer> integerList = Arrays.stream(str).filter(input -> input.matches("[0-9]+")).map(Integer::valueOf).toList();
		System.out.println(integerList);
	}
}
