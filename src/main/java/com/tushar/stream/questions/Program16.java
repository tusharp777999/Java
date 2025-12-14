package com.tushar.stream.questions;

/*
* Group/Pair anagrams from a list of Strings. For 1 word consider only one anagram.
* I/P: String[] str = {"pat", "tap", "pan", "nap", "Team", "tree", "meat"};
* O/P: [[pan, nap], [pat, tap], [Team, meat], [tree]]
*/

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Program16 {
    public static void main(String[] args) {
        String[] str = {"pat", "tap", "pan", "nap", "Team", "tree", "meat"};
        Collection<List<String>> list = Arrays.stream(str).collect(Collectors.groupingBy(data -> Arrays.stream(data.toLowerCase().split("")).sorted().toList())).values();
        System.out.println(list);
    }
}
