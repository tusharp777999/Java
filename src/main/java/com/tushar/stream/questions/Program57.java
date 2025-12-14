package com.tushar.stream.questions;

/*
* Given a list of Employees with their names and department names, write a Stream API solution to find the department that has the maximum number of employees.
*/

import com.tushar.stream.utility.Employee3;
import com.tushar.stream.utility.Utility;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Program57 {
    public static void main(String[] args) {
        List<Employee3> list = Utility.getEmployees3();
        Map.Entry<String, Long> result = list.stream().collect(Collectors.groupingBy(data -> ((Employee3)data).getDepartment(), Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println(result);

        String result1 = list.stream().collect(Collectors.groupingBy(data -> ((Employee3)data).getDepartment(), Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).map(data -> data.getKey()).get();
        System.out.println(result1);
    }
}
