package com.tushar.JavaMapPractice;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.tushar.database.EmployeeDatabase;
import com.tushar.entity.Employee;

public class JavaMapPractice {
	public static void main(String[] args) {
		
		//map takes Function interface as an input which takes one input and output the method it have is [ R apply(T t)] as an abstract method.
		//map is used to get a particular field from an object based on some condition or without condition as well. Example: I have list of Employee object but from it I want 
		//only names of the Employees list so map will help you in this case.
		
		//Loading data for stream manipulation.
		List<Employee> employees = EmployeeDatabase.getAllEmployees();
		
		//Getting only employee department using map
		List<String> employeesDept = employees.stream().map(employeeData -> employeeData.getDept()).toList();
		System.out.println(employeesDept);
		
		System.out.println("======================================================================================================================================================");
		
		//or
		//Getting only employee department using map using method reference
		List<String> employeesDept1 = employees.stream().map(Employee::getDept).toList();
		System.out.println(employeesDept1);
		
		System.out.println("======================================================================================================================================================");
		
		//or
		//Getting only employee department using map using method reference and collect method
		List<String> employeesDept2 = employees.stream().map(Employee::getDept).collect(Collectors.toList());
		System.out.println(employeesDept2);
		
		System.out.println("======================================================================================================================================================");
		
		//If you want unique department get the departments and convert into the set. It does not maintain the sequence or preserve the insertion order.
		Set<String> uniqueDepartment = employees.stream().map(Employee::getDept).collect(Collectors.toSet());
		System.out.println(uniqueDepartment);
		
		System.out.println("======================================================================================================================================================");
		
		//or
		//If you want unique department you can just use the distinct function and convert it into the list. It preserves the insertion order of the data.
		List<String> uniqueDepartment1 = employees.stream().map(Employee::getDept).distinct().toList();
		System.out.println(uniqueDepartment1);
		
	}
}
