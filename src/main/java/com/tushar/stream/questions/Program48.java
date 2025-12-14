package com.tushar.stream.questions;

/*
* Stream methods.
*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program48 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ema", "John", "Amit", "Karen");
        List<List<String>> namesNestedList = Arrays.asList(Arrays.asList("Ema", "John", "Amit", "Karen"), Arrays.asList("Mike", "Jordan", "Joe", "Damodar"));

        //#1 stream():Converts a collection into a stream.
        Stream<String> stream = names.stream();
        System.out.println(stream);

        //#2 filter():Based on a boolean condition.
        List<String> nameList = names.stream().filter(data -> data.startsWith("A")).toList();
        System.out.println(nameList);

        //#3 map():Transforms each element into another form.
        List<Integer> namesLengthList = names.stream().map(String::length).toList();
        System.out.println(namesLengthList);

        //#4 flatMap():Flattens the nested structure into a single stream.
        System.out.println(namesNestedList);
        List<String> flattenList = namesNestedList.stream().flatMap(data -> data.stream()).toList();
        System.out.println(flattenList);

        //#5 forEach():Iterates over each element.
        names.stream().forEach(System.out::println);

        //#6 collect():Used to collect the elements into Collection.
        namesNestedList.stream().flatMap(data -> data.stream()).collect(Collectors.toList()).forEach(System.out::println);

        //#7 sorted():Sort the element in natural order if you want customized order just provide a Comparator in its parameter.
        names.stream().sorted().forEach(System.out::println);
    }
}
