package com.tushar.stream.questions;

/*
* There is list of Employee objects having field name and email.
* Find the list of domains like (gmail.com, yahoo.com etc) and the occurrences of each domain.
*/

import com.tushar.stream.utility.Employee;
import com.tushar.stream.utility.Utility;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program33 {
    public static void main(String[] args) {
        List<Employee> employees = Utility.getEmployees();
        Map<String, Long> result = employees.stream().map(data -> data.getEmail().substring(data.getEmail().indexOf("@") + 1))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(result);
    }
}
