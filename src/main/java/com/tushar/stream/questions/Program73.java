package com.tushar.stream.questions;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
* Given a list of Integers as below
* I/P: List<Integer> list = List.of(11, 33, 2, 1, 4, 2, 1, 55, 1, 33, 33);
* O/P: [1, 1, 33, 33, 2]
* If you have exact two occurrence of Integer you have to print it and if it is more than 3 consider it occurred 2 times.
*/

public class Program73 {
    static void main() {
        List<Integer> list = List.of(11, 33, 2, 1, 4, 2, 1, 55, 1, 33, 33);
        List<Integer> result =
                list.stream()
                        .collect(Collectors.groupingBy(i -> i, Collectors.counting()))
                        .entrySet().stream()
                        .filter(e -> e.getValue() > 1)
                        .flatMap(e -> Stream.generate(e::getKey)
                                .limit(e.getValue() / 2 + e.getValue() % 2))
                        .toList();
        System.out.println(result);
    }
}
