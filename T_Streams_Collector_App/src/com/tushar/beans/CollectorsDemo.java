package com.tushar.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsDemo {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("Ram", 23, 20000));
		employees.add(new Employee("Ashok", 25, 30000));
		employees.add(new Employee("Suresh", 33, 25000));
		employees.add(new Employee("Charan", 26, 40000));
		
		//If you want to convert the result of map into the other List of names we can do it using Collectors
		List<String> employeeNames = employees.stream().map(employee -> employee.getName()).collect(Collectors.toList());
	}
}
