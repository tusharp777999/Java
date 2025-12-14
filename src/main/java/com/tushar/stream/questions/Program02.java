package com.tushar.stream.questions;

/*
*Remove duplicate from the string and return in the same order.
* I/P: String str = "dabcadefg";
* O/P: dabcefg
**/

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class Program02 {
    public static void main(String[] args) {
        String str = "dabcadefg";
        //Arrays.stream(str.split("")).distinct().forEach(System.out::print);
        //str.chars().distinct().mapToObj(data -> (char) data).forEach(System.out::print);
        //Arrays.stream(str.split("")).collect(Collectors.toSet()).forEach(System.out::print); changes sequence
        Arrays.stream(str.split("")).collect(Collectors.toCollection(LinkedHashSet::new)).forEach(System.out::print);
    }
}
