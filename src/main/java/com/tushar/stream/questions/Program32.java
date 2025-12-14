package com.tushar.stream.questions;

/*
* Find the intersection of two lists using Java Streams.
* I/P:  List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
*       List<Integer> list2 = Arrays.asList(3, 5, 6, 7);
* O/P: [3, 5]
*/

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program32 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(3, 5, 6, 7);
        List<Integer> result = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(data -> data.getValue() > 1).map(s -> s.getKey()).toList();
        System.out.println(result);

        //List<Integer> result1 = list1.stream().filter(list2::contains).toList();
        List<Integer> result1 = list1.stream().filter(data -> list2.contains(data)).toList();
        System.out.println(result1);
    }
}
