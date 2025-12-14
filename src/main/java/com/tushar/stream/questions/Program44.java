package com.tushar.stream.questions;

/*
* Best practices to avoid common pitfalls when using Java Stream.
* 1. Avoid performing complex transformations in single pipeline.
* Given a Person list, fetch the list of names of a Person.
*   Whose age is greater than 30.
*   Name should be unique.
*   Name should be in sorted order.
*/

import com.tushar.stream.utility.Person;
import com.tushar.stream.utility.Utility;

import java.util.List;

public class Program44 {
    public static void main(String[] args) {
        List<Person> personList = Utility.getPersons();

        //Bad practice.
        List<String> result = personList.stream()
                .filter(data -> data.getAge() > 30)
                .map(data -> data.getName())
                .distinct()
                .sorted()
                .toList();
        System.out.println(result);

        //Good practice.
        List<String> result1 = personList.stream()
                .filter(data -> data.getAge() > 30)
                .map(data -> data.getName()).toList();
        System.out.println(result1);

        List<String> result2 = result1.stream().distinct().sorted().toList();
        System.out.println(result2);
    }

}
