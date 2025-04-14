package com.tushar.JavaGroupingByPractice;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.tushar.database.EmployeeDatabase;
import com.tushar.entity.Employee;

public class JavaGroupingByPractice {
	public static void main(String[] args) {
		
		//Loading data for stream manipulation.
		List<Employee> employees = EmployeeDatabase.getAllEmployees();
		
		//It groups the data based on the key which will you provide in Collectors.groupingBy() method.
		Map<String, List<Employee>> employeeMap = employees.stream().collect(Collectors.groupingBy(Employee::getGender));
		System.out.println(employeeMap);

		System.out.println("======================================================================================================================================================");
		
		//I want the group of Employees based on the Gender type and with Employee names within it.
		Map<String, List<String>> groupByGenderWithNames = employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.mapping(Employee::getName, Collectors.toList())));
		System.out.println(groupByGenderWithNames);

		System.out.println("======================================================================================================================================================");
		
		//I want the group of Employees based on the Gender type and with counting of it.
		Map<String, Long> groupByGenderWithCounting = employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(groupByGenderWithCounting);
	}
}
