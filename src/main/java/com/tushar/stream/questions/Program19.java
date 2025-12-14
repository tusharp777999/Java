package com.tushar.stream.questions;

/*
 * Write a stream program to move all zero's beginning of array int[].
 * I/P: int[] array = {5, 0, 1, 0, 8, 0};
 * O/P: {0, 0, 0, 5, 1, 8}
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program19 {
    public static void main(String[] args) {
        int[] array = {5, 0, 1, 0, 8, 0};
        List<Integer> result = Arrays.stream(array).boxed().toList().stream().collect(Collectors.groupingBy(data -> data != 0, Collectors.toList()))
                .entrySet().stream().map(convertedData -> convertedData.getValue()).flatMap(newData -> newData.stream()).toList();
        System.out.println(result);

        List<Integer> result2 = Arrays.stream(array).boxed().toList().stream().collect(Collectors.groupingBy(data -> data != 0)).values()
                .stream().flatMap(newData -> newData.stream()).toList();
        System.out.println(result2);
    }
}
