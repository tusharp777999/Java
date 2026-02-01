package com.tushar.stream.questions;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
* Given an string.
* I/P:  String name = "Tushar";
* O/P: rahsuT
*/
public class Program66 {
    public static void main(String[] args) {
        String name = "Tushar";
        String result = Stream.of(name).map(data -> new StringBuilder(data).reverse()).collect(Collectors.joining());
        System.out.println(result);

        String str = "Tushar";
        IntStream.rangeClosed(0, str.length() - 1).mapToObj(i -> str.charAt(str.length() - 1 - i)).forEach(System.out::print);

    }
}
