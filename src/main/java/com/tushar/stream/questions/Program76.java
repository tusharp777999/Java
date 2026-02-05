package com.tushar.stream.questions;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
* Given an input of any alphabet in any case and you need to find the remaining alphabets.
* I/P: String input = "abcd";
*/

public class Program76 {
    public static void main(String[] args) {

        String input = "abd";

        String remaining = IntStream.rangeClosed('a', 'z')
                .mapToObj(c -> (char) c)
                .filter(ch ->
                        input.toLowerCase()
                                .chars()
                                .noneMatch(c -> c == ch)   // key line
                )
                .map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println(remaining);

        String input1 = "abcd";

        // Convert input string chars to a Set
        Set<Character> present = input1.toLowerCase()
                .chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toSet());

        // Generate a–z and filter missing ones
        String remaining1 = IntStream.rangeClosed('a', 'z')
                .mapToObj(c -> (char) c)
                .filter(c -> !present.contains(c))
                .map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println(remaining1);
    }
}

