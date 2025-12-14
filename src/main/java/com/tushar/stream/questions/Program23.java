package com.tushar.stream.questions;

/*
 * Sort a list of string in alphabetical order.
 * I/P: List<String> strList = Arrays.asList("Zudio", "Puma", "Adidas", "MAC", "H&M");
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Program23 {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("Zudio", "Puma", "Adidas", "MAC", "H&M");
        List<String> ascendingSortedList = strList.stream().sorted().toList();
        System.out.println(ascendingSortedList);

        List<String> descendingSortedList = strList.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(descendingSortedList);
    }
}
