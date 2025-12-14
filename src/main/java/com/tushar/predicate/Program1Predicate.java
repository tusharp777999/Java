package com.tushar.predicate;

import java.util.function.Predicate;

public class Program1Predicate {
    public static  void main(String[] args) {
        String str1 = "";
        String str2 = "Tushar";
        //Predicate<String> predicate1 = (stringData) -> stringData.isEmpty();
        Predicate<String> predicate1 = String::isEmpty;
        System.out.println(predicate1.test(str1));
        System.out.println(predicate1.test(str2));
    }
}
