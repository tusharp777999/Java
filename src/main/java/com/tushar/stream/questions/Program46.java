package com.tushar.stream.questions;

/*
* Given a list of names, find all the names that starts with "A", and also print the count of names found.
*/

import java.util.Arrays;
import java.util.List;

public class Program46 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ema", "Bob", "Alice", "Anna");
        List<String> convertedList = list.stream().filter(data -> data.startsWith("A")).toList();
        convertedList.forEach(System.out::println);
        System.out.println(convertedList.size());
    }
}
