package com.tushar.stream;

import com.tushar.stream.utility.Utility;

import java.util.List;

public class Program5StreamMaxMin {
    public static void main(String[] args) {
        List<Integer> integerList = Utility.getIntegers();
        Integer min = integerList.stream().min((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println(min);

        Integer max = integerList.stream().max((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println(max);
    }
}
