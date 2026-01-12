package com.tushar.stream.questions;

import com.tushar.stream.utility.Employee2;
import com.tushar.stream.utility.Utility;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
* Given an Employee list we need to increment the salary by 10% of Employees whose salary is less < 10000
* and give the sum of the only incremented values which is 10%.
*/
public class Program67 {
    public static void main(String[] args) {
        List<Employee2> employee2List = Utility.getEmployees2();
        double result = employee2List.stream().filter(data -> data.getSalary() < 10000)
                .mapToDouble(data -> {
                                                    double incrementedSalary = data.getSalary() * 0.10;
                                                    data.setSalary(data.getSalary() + incrementedSalary);
                                                    return incrementedSalary;
                                                })
                .sum();
        System.out.println(result);
    }
}
