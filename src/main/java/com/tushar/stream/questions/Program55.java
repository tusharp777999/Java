package com.tushar.stream.questions;

/*
* Given a Person object where each person has a first name and last name. Sort the List<Person> by their first name then by last name.
*/


import com.tushar.stream.utility.Person2;
import com.tushar.stream.utility.Utility;

import java.util.Comparator;
import java.util.List;

public class Program55 {
    public static void main(String[] args) {
        List<Person2> person2List = Utility.getPerson2();
        person2List.stream()
                .sorted(Comparator.comparing(data -> ((Person2)data).getFirstName()).thenComparing(data -> ((Person2)data).getLastName()))
                .forEach(System.out::println);

        person2List.stream()
                .sorted(Comparator.comparing(Person2::getFirstName).thenComparing(Person2::getLastName))
                .forEach(System.out::println);
    }
}
