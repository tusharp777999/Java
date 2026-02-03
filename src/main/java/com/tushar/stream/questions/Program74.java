package com.tushar.stream.questions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*
* Given list of String as below.
* I/P: List<String> list = List.of("viratkohli","rishabpant","rohitsharma", "shikardawan","msdhoni","jadeja", null,"  ");
* O/P: [Rishabpant, Rohitsharma]
* Write a program using the Optional class to handle the null and find the string which starts with "r" and make the "r" to "R" capital letter.
 */

public class Program74 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList(
                "viratkohli","rishabpant","rohitsharma",
                "shikardawan","msdhoni","jadeja", null,"  ");

        List<String> newList = list.stream()
                .map(Optional::ofNullable)     // wrap
                .flatMap(Optional::stream)     // remove nulls (better than get())
                .filter(s -> !s.isBlank())     // remove blanks
                .filter(s -> s.startsWith("r"))// only r
                .map(s -> s.substring(0,1).toUpperCase() + s.substring(1))
                .toList();

        System.out.println(newList);
    }
}
