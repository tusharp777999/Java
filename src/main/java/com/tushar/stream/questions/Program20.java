package com.tushar.stream.questions;

/*
* Write a program for in a given array of integers, return true if it contains distinct values otherwise false.
* I/P: int[] array = {5, 0, 1, 0, 8, 0};
* O/P: false
*/

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program20 {
    public static void main(String[] args) {
        int[] array = {5, 0, 1, 0, 8, 0};
        boolean result = Arrays.stream(array).boxed().toList().stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).values()
                .stream().noneMatch(data -> data > 1);
        System.out.println(result);

        boolean result1 = Arrays.stream(array).boxed().toList().stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).values()
                .stream().allMatch(data -> data <= 1);
        System.out.println(result1);
    }
}
