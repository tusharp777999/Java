package com.tushar.stream.questions;

/*
* Stream methods.
*/

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Program51 {
    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Harry", "Ron", "Hermoine");
        List<Integer> numberList = Arrays.asList(1, 2, 3, 4);

        //#16 findFirst():It returns first element of a stream.
        String firstName = nameList.stream().findFirst().get();
        System.out.println(firstName);

        //#17 findAny():It returns any element of a stream.
        String anyName = nameList.stream().findAny().get();
        System.out.println(anyName);

        //#18 max():It finds maximum according to the comparator.
        Integer max = numberList.stream().max(Integer::compareTo).get();
        System.out.println(max);

        //#19 min():It finds minimum according to the comparator.
        Integer min = numberList.stream().min(Integer::compareTo).get();
        System.out.println(min);

        //#20 toArray():It converts the stream to an array.
        String[] array = nameList.stream().toArray(String[]::new);
        Arrays.stream(array).forEach(System.out::println);

        //#21 generate():It creates a infinite stream of elements.
        Stream<Double> randomStreamList = Stream.generate(Math::random);
        randomStreamList.limit(3).forEach(System.out::println);

        //#22 iterate()
        //#23 of()
        //#24 concat()
        //#25 reduce()
    }
}
