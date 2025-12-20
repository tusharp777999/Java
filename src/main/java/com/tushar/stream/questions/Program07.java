package com.tushar.stream.questions;

/*
*Given a list of integers, divide it into two lists one having an even number and the other having an odd number.
* I/P: int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8};
* O/P: [[1, 3, 5, 7], [2, 4, 6, 8]]
*/

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Program07 {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8};
        List<Integer> integerList = Arrays.stream(inputArray).boxed().toList();
        List<List<Integer>> listedData = integerList.stream().collect(Collectors.groupingBy(data -> data % 2 == 0, Collectors.toList())).entrySet().stream().map(newData -> newData.getValue()).toList();
        //List<List<Integer>> listedData = integerList.stream().collect(Collectors.partitioningBy(data -> data % 2 == 0, Collectors.toList())).entrySet().stream().map(newData -> newData.getValue()).toList();
        //Collection<List<Integer>> ans = integerList.stream().collect(Collectors.groupingBy(data -> data % 2 == 0, Collectors.toList())).values();
        System.out.println(listedData);
    }
}
