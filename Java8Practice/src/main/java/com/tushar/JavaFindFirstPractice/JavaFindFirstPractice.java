package com.tushar.JavaFindFirstPractice;

import java.util.List;

import com.tushar.database.EmployeeDatabase;
import com.tushar.entity.Employee;

public class JavaFindFirstPractice {
	public static void main(String[] args) {
		
		//Loading data for stream manipulation.
		List<Employee> employees = EmployeeDatabase.getAllEmployees();
		
		//I want Employee who is first present in the List. Here we are using get() directly where is the possibility of null as well.
		Employee employee = employees.stream().filter(employeeData -> employeeData.getDept().equals("Development")).findFirst().get();
		System.out.println(employee);
		
		//Better approach to get the data of the Employee data which is filtered using ifPresent().
		employees.stream().filter(employeeData -> employeeData.getDept().equals("Development")).findFirst().ifPresent(emp -> System.out.println(emp));
		
		//Better approach to get the data of the Employee data which is filtered using ifPresentOrElse().
		employees.stream().filter(employeeData -> employeeData.getDept().equals("Development")).findFirst().ifPresentOrElse(emp -> {System.out.println(emp);}, () -> {System.out.println("Data Not Present");});
		
		//Better approach to get the data of the Employee data which is filtered using orElse().
		employees.stream().filter(employeeData -> employeeData.getDept().equals("Development")).findFirst().orElse(new Employee());
		
		//Better approach to get the data of the Employee data which is filtered using orElseThrow().
		employees.stream().filter(employeeData -> employeeData.getDept().equals("Development")).findFirst().orElseThrow(() -> new IllegalArgumentException("No Data Exception"));
		
		//findAny() approach is used in Parallel Stream just to check whether the data is coming or not. Because if you have large data set and just want to check whether the dataset
		//contains the data or not for the further process of flow in the program to be continue.
		employees.stream().filter(employeeData -> employeeData.getDept().equals("Development")).findAny().orElseThrow(() -> new IllegalArgumentException("No Data Exception"));
		
	}
}
