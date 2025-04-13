package com.tushar.JavaFlatMapPractice;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.tushar.database.EmployeeDatabase;
import com.tushar.entity.Employee;

public class JavaFlatMapPractice {
	public static void main(String[] args) {
		
		//flatMap takes Function interface as an input which have abstract method as [R apply(T t)] takes one input and one output.
		
		//Loading data for stream manipulation.
		List<Employee> employees = EmployeeDatabase.getAllEmployees();
		
		//Here the issue is that we have Employee class and within that each Employee has a list of Projects in it, but when we try to fetch the particular Employee
		//Project data we are getting in the form of Stream only so the nesting data we didn't get directly we need to use foreach within that again foreach, then the flatMap comes into picture.
		List<Stream<String>> projectData = employees.stream().map(employeeData -> employeeData.getProjects().stream().map(employeeProjects -> employeeProjects.getName())).toList();
		projectData.forEach(stream -> {
		    stream.forEach(System.out::println);
		});

		System.out.println("======================================================================================================================================================");
		
		//or
		employees.stream().map(employeeData -> employeeData.getProjects().stream().map(employeeProjects -> employeeProjects.getName())).toList().
		forEach(streamedData -> streamedData.forEach(System.out::println));
		
		System.out.println("======================================================================================================================================================");
		
		//Use of flatMap.
		List<String> projectNames = employees.stream().flatMap(employeeData -> employeeData.getProjects().stream()).map(project -> project.getName()).toList();
		System.out.println(projectNames);
		
		System.out.println("======================================================================================================================================================");
		
		//Get the unique values using Set. It don't preserves the order.
		Set<String> projectNamesSet = employees.stream().flatMap(employeeData -> employeeData.getProjects().stream()).map(project -> project.getName()).collect(Collectors.toSet());
		System.out.println(projectNamesSet);
	
		System.out.println("======================================================================================================================================================");
		
		//or using distinct it preserves the order.
		List<String> projectNamesDistinct = employees.stream().flatMap(employeeData -> employeeData.getProjects().stream()).map(project -> project.getName()).distinct().toList();
		System.out.println(projectNamesDistinct);
		
	}
}
