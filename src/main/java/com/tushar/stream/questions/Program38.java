package com.tushar.stream.questions;

/*
* Convert a list to a Map. Given a Person object list, Convert it to a Map with the key as 'City' and value as List<Person>
* List<Person> -> Map<String, List<Person>>
*/

import com.tushar.stream.utility.Person1;
import com.tushar.stream.utility.Utility;

import java.util.List;
import java.util.stream.Collectors;

public class Program38 {
    public static void main(String[] args) {
        List<Person1> list = Utility.getPersons1();
        list.stream().collect(Collectors.groupingBy(data -> data.getCity(), Collectors.toList())).forEach((key, value) -> System.out.println(key + " " + value));

    }
}
