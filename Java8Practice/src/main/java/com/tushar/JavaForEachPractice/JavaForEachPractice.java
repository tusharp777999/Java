package com.tushar.JavaForEachPractice;

import java.util.List;

import com.tushar.database.EmployeeDatabase;
import com.tushar.entity.Employee;

public class JavaForEachPractice {
	public static void main(String[] args) {
		
		//forEach take Consumer as an input which takes one input and returns void which means nothing and having a method [void accept(T t)] this abstract method.
		
		//Loading data for stream manipulation.
		List<Employee> employees = EmployeeDatabase.getAllEmployees();
		
		//forEach on stream just to print the data of a list.
		employees.forEach(System.out::println);
		
		System.out.println("======================================================================================================================================================");
		
		//or 
		employees.forEach(employeeData -> System.out.println(employeeData));
		
		System.out.println("======================================================================================================================================================");
		
		//forEach on stream just to print the particular data of a list.
		employees.forEach(employeeData -> System.out.println(employeeData.getName() + " : " + employeeData.getDept()));
		
		System.out.println("======================================================================================================================================================");
		
	}
}
