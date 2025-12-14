package com.tushar.stream.questions;

/*
* Concatenate 2 streams using Stream API.
* I/P:  Stream<String> stream1 = Stream.of("Java", "Python");
*       Stream<String> stream2 = Stream.of("C++", "C#");
* O/P:  Java
*       Python
*       C++
*       C#
*/

import java.util.List;
import java.util.stream.Stream;

public class Program43 {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("Java", "Python");
        Stream<String> stream2 = Stream.of("C++", "C#");
        Stream.concat(stream1, stream2).toList().forEach(System.out::println);
    }
}
