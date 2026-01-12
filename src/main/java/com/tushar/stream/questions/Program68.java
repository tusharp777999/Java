package com.tushar.stream.questions;

import com.tushar.stream.utility.Employee2;
import com.tushar.stream.utility.Employee4;
import com.tushar.stream.utility.Utility;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
* Given Employee list with salary and department. Need a department name where the sum of that particular department is greater than all other departments.
*/
public class Program68 {
    public static void main(String[] args) {
        List<Employee4> employee4List = Utility.getEmployees4();
        String departmentName = employee4List.stream().collect(Collectors.groupingBy(employees -> employees.getDepartment(), Collectors.summingDouble(emp -> emp.getSalary())))
                .entrySet().stream().max(Comparator.comparingDouble(data -> data.getValue())).map(data -> data.getKey()).get();
        System.out.println(departmentName);
    }
}
