package com.tushar.stream.questions;

/*
* Print all Employees with salary greater than 20000 and increase their salary by 1000.
*/

import com.tushar.stream.utility.Employee2;
import com.tushar.stream.utility.Utility;

import java.util.List;

public class Program54 {
    public static void main(String[] args) {
        List<Employee2> list = Utility.getEmployees2();
        list.stream()
                .filter(data -> data.getSalary() > 20000)
                .map(data -> {
                    double salary = data.getSalary() + 1000;
                    data.setSalary(salary);
                    return data;
                }).toList()
                .forEach(System.out::println);

        list.stream()
                .filter(data -> data.getSalary() > 20000)
                .peek(data -> data.setSalary(data.getSalary() + 1000)).toList()
                .forEach(System.out::println);
    }
}
