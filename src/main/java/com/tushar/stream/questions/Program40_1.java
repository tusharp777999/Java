package com.tushar.stream.questions;

/*
* Can we reuse the same stream for another operation.
* Answer: We cannot use single stream for another operation but there is a trick to use it.
*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program40_1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Alice", "Bob", "Charlie", "Anna");
        Stream<String> stream = list.stream();

        //First time used.
        stream.forEach(System.out::println);

        //Second time when we use it will throw an Exception: java.lang.IllegalStateException: stream has already been operated upon or closed
        long size = stream.count();
        System.out.println(size);
    }
}
