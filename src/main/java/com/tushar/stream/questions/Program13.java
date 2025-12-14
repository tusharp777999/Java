package com.tushar.stream.questions;

/*
* Given an array of integers, group the numbers by the range in which they belong.
* I/P: int[] array = {2, 3, 10, 14, 20, 24, 30, 34, 40, 44, 50, 54};
* O/P: {0=[2, 3], 10=[10, 14], 20=[20, 24], 30=[30, 34], 40=[40, 44], 50=[50, 54]}
*/

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Program13 {
    public static void main(String[] args) {
        int[] array = {2, 3, 10, 14, 20, 24, 30, 34, 40, 44, 50, 54};

        Map<Integer, List<Integer>> result = Arrays.stream(array).boxed().toList()
                .stream().collect(Collectors.groupingBy(data -> data/10*10, LinkedHashMap::new, Collectors.toList()));
        System.out.println(result);
    }
}
