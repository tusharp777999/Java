package com.tushar.stream.questions;

import com.tushar.stream.utility.Employee6;

import java.util.Comparator;
import java.util.List;

/*
* Given a list of Employee with the fields name, department and salary.
* Filtered out data based on sales department and show only 3 highest salaried Employees.
*/

public class Program64 {
    public static void main(String[] args) {
        List<Employee6> employee6List = List.of(new Employee6("Tushar", "Sales", 2000),
                                                new Employee6("Vishal", "Sales", 3000),
                                                new Employee6("Kishor", "IT", 5000),
                                                new Employee6("Ramesh", "Sales", 9000),
                                                new Employee6("Soham", "IT", 4000),
                                                new Employee6("Krish", "Sales", 1000));

        List<Employee6> filteredEmployeeList = employee6List.stream().filter(data -> data.getDepartment().equalsIgnoreCase("Sales"))
                .sorted(Comparator.comparing((Employee6 data) -> data.getSalary()).reversed()).limit(3).toList();
        System.out.println(filteredEmployeeList);
    }
}
