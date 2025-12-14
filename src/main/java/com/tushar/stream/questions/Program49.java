package com.tushar.stream.questions;

/*
* Stream methods.
*/

import java.util.Arrays;
import java.util.List;

public class Program49 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ema", "John", "Amit", "Karen");
        List<String> namesWithA = Arrays.asList("Aman", "Amar", "Amit", "Akash");
        List<String> namesWithDuplicates = Arrays.asList("Ema", "John", "Amit", "Karen", "John", "Ema");

        //#8 limit():Restricts or limits the elements from the stream.
        names.stream().limit(2).toList().forEach(System.out::println);

        //#9 distinct():It removes duplicates.
        namesWithDuplicates.stream().distinct().toList().forEach(System.out::println);

        //#10 skip():It skips the number of records.
        names.stream().skip(1).toList().forEach(System.out::println);

        //#11 peek():It allows inspection of each element in stream
        names.stream().peek(System.out::println).toList();

        //#12 count():It counts number of elements in the stream.
        long count = names.stream().count();
        System.out.println(count);

        //#13 allMatch():It returns true if all elements match the predicate.
        boolean result = namesWithA.stream().allMatch(data -> data.startsWith("A"));
        System.out.println(result);

        //#14 anyMatch():It returns true if any element is matched the predicate.
        boolean result1 = names.stream().anyMatch(data -> data.startsWith("A"));
        System.out.println(result1);

        //#15 noneMatch():It returns true if no element is matched the predicate.
        boolean result2 = names.stream().noneMatch(data -> data.startsWith("Z"));
        System.out.println(result2);
    }
}
