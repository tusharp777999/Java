package com.tushar.stream.questions;

/*
* Given an Employee object, print the average of the age of male and female employees.
*/

import com.tushar.stream.utility.Employee1;
import com.tushar.stream.utility.Utility;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Program50 {
    public static void main(String[] args) {
        List<Employee1> list = Utility.getEmployees1();
        Map<String, Double> result = list.stream().collect(Collectors.groupingBy(data -> data.getGender(), Collectors.averagingInt(ageData -> ageData.getAge())));
        System.out.println(result);
    }
}
