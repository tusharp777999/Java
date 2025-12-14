package com.tushar.stream.questions;

/*
* Given a list of Employees, where each Employee has a name, department and salary.
* Write a Stream API solution to calculate the average salary for each department and display the results.
*/

import com.tushar.stream.utility.Employee4;
import com.tushar.stream.utility.Utility;

import java.util.List;
import java.util.stream.Collectors;

public class Program58 {
    public static void main(String[] args) {
        List<Employee4> list = Utility.getEmployees4();
        list.stream()
                .collect(Collectors.groupingBy(data -> data.getDepartment(), Collectors.averagingDouble(data -> data.getSalary())))
                .forEach((department, salary) -> System.out.println(department + " " +salary));
    }
}
