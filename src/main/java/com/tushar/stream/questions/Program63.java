package com.tushar.stream.questions;

/*
* Given list of string remove the null and empty string from it.
* I/P: List<String> list = Arrays.asList("a", "b", "", null, "c");
* O/P: [a, b, c]
*/

import java.util.Arrays;
import java.util.List;

public class Program63 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "", null, "c");
        List<String> filteredData = list.stream().filter(data -> data != null && data != "").toList();
        System.out.println(filteredData);
    }
}
