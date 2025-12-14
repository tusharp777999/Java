package com.tushar.stream.questions;

/*
* Transfer Employee Object into EmployeeDTO
* I/P: List<Employee> employeeList = List.of(new Employee5(1, "Alice"), new Employee5(2, "Bob"));
* O/P: EmployeeDTO{id=1, name="Alice"} EmployeeDTO{id=2, name="Bob"}
*/

import com.tushar.stream.utility.Employee5;
import com.tushar.stream.utility.EmployeeDTO;

import java.util.List;

public class Program62 {
    public static void main(String[] args) {
        List<Employee5> employeeList = List.of(new Employee5(1, "Alice"), new Employee5(2, "Bob"));
        List<EmployeeDTO> result = employeeList.stream().map(employee -> new EmployeeDTO(employee.getId(), employee.getName())).toList();
        result.forEach(System.out::println);
    }
}
