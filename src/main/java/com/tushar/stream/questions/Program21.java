package com.tushar.stream.questions;

/*
* Given the string[] group the strings based on the middle character.
* I/P: String[] strArray = {"ewe", "jji", "jhj", "kwk", "aha"};
* O/P: {w=[ewe, kwk], h=[jhj, aha], j=[jji]}
*/

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Program21 {
    public static void main(String[] args) {
        String[] strArray = {"ewe", "jji", "jhj", "kwk", "aha"};
        Map<String, List<String>> result = Arrays.stream(strArray).collect(Collectors.groupingBy(data -> data.substring(1, 2)));
        System.out.println(result);
    }
}
