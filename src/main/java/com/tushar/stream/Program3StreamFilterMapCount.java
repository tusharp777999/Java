package com.tushar.stream;

import com.tushar.stream.utility.Utility;

import java.util.List;

public class Program3StreamFilterMapCount {
    public static void main(String[] args) {
        List<String> list = Utility.getVegetables();

        List<String> greaterThanSix = list.stream().filter(str -> str.length() > 6).toList();
        System.out.println(greaterThanSix);

        List<String> capitalList = list.stream().map(String::toUpperCase).toList();
        System.out.println(capitalList);

        Long count1 = list.stream().count();
        System.out.println(count1);

        Long count2 = list.stream().filter(str -> str.length() > 6).count();
        System.out.println(count2);
    }
}
