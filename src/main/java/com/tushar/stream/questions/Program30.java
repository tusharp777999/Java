package com.tushar.stream.questions;

/*
 * Convert a list of strings to uppercase.
 * I/P: List<String> str = Arrays.asList("breaking bad", "game of thrones", "big bang theory");
 * O/P: [BREAKING BAD, GAME OF THRONES, BIG BANG THEORY]
 */

import java.util.Arrays;
import java.util.List;

public class Program30 {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("breaking bad", "game of thrones", "big bang theory");
        List<String> result = str.stream().map(String::toUpperCase).toList();
        System.out.println(result);
    }
}
