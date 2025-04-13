package com.tushar.JavaSortedPractice;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.tushar.database.EmployeeDatabase;
import com.tushar.entity.Employee;

public class JavaSortedPractice {
	public static void main(String[] args) {
		
		//sorted
		
		//Loading data for stream manipulation.
		List<Employee> employees = EmployeeDatabase.getAllEmployees();
		
		//This will not work because to work only sorted method without any argument it don't know on which basis your Employees should get sorted so to work below
		//code you need to implement Comparable in the Employee class then it will work otherwise you need to use the sorted(Comparable) this method.
		//List<Employee> sortedEmployees = employees.stream().sorted().toList();
		//System.out.println(sortedEmployees);
		
		//This sorts the Employee object data based on the Employee salary, by default it sorts based on the Natural sorting order.
		List<Employee> sortedAscEmployees = employees.stream().sorted(Comparator.comparing(Employee::getSalary)).toList();
		System.out.println(sortedAscEmployees);
		
		System.out.println("======================================================================================================================================================");
		
		//This sorts the Employee object data based on the Employee salary, by default it sorts based on the Natural sorting order but sorting in descending order.
		List<Employee> sortedDescEmployees = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).toList();
		System.out.println(sortedDescEmployees);
		
		System.out.println("======================================================================================================================================================");
		
		//or Collections class reverseOrder method we can use.
		List<Employee> sortedDescEmployees1 = employees.stream().sorted(Collections.reverseOrder(Comparator.comparing(Employee::getSalary))).toList();
		System.out.println(sortedDescEmployees1);
		
	}
}
