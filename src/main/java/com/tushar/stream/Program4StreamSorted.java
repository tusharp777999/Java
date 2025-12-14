package com.tushar.stream;

import com.tushar.stream.utility.Utility;

import java.util.List;

public class Program4StreamSorted {
    public static void main(String[] args) {
        List<Integer> integerList = Utility.getIntegers();
        System.out.println(integerList);
        List<Integer> ascendingSortedIntegerList = integerList.stream().sorted().toList();
        System.out.println(ascendingSortedIntegerList);

        List<Integer> decendingSortedIntegerList = integerList.stream().sorted((i1, i2) -> -i1.compareTo(i2)).toList();
        System.out.println(decendingSortedIntegerList);
    }
}
