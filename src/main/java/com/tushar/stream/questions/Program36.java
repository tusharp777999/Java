package com.tushar.stream.questions;

/*
* Transform Person object stream into a single string consisting of all names in upper letters separated by "|" (pipe) character.
* O/P: MAX|PETER|PAMELA|DAVID|DAN
*/

import com.tushar.stream.utility.Person;
import com.tushar.stream.utility.Utility;

import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Program36 {
    public static void main(String[] args) {
        List<Person> personList = Utility.getPersons();
        String result = personList.stream()
                .collect(Collector.of(
                        () -> new StringJoiner(" | "),
                        (joiner, personData) -> joiner.add(personData.getName().toUpperCase()),
                        (joiner1, joiner2) -> joiner1.merge(joiner2),
                        joiner -> joiner.toString()
                ));
        System.out.println(result);

        String result1 = personList.stream()
                .map(person -> person.getName().toUpperCase()).collect(Collectors.joining(" | "));
        System.out.println(result1);

        String result2 = personList.stream().map(person -> person.getName().toUpperCase())
                .reduce((a, b) -> a + " | " + b)
                .orElse("");;
        System.out.println(result2);
    }
}
