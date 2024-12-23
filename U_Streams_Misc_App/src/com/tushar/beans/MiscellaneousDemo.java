package com.tushar.beans;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class MiscellaneousDemo {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("Ram", 23, 20000));
		employees.add(new Employee("Ashok", 25, 30000));
		employees.add(new Employee("Suresh", 33, 25000));
		employees.add(new Employee("Charan", 26, 40000));
		employees.add(new Employee("Laxman", 23, 20000));
	
		Double employeesAverageSalary = employees.stream().collect(Collectors.averagingInt(employee -> employee.getSalary()));
		System.out.println("Employee average salary: " + employeesAverageSalary);

		Optional<Employee> minimumEmployeeSalary = employees.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getSalary)));
		System.out.println("Minimum Salary: " + minimumEmployeeSalary.get());
		
		Optional<Employee> maximumEmployeeSalary = employees.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
		System.out.println("Maximum Salary: " + maximumEmployeeSalary.get());
		
		Map<Integer, List<Employee>> groupingEmployeesBySalary = employees.stream().collect(Collectors.groupingBy(employee -> employee.getSalary()));
		System.out.println("Grouping Employees by Salary: " + groupingEmployeesBySalary);
	}
}
