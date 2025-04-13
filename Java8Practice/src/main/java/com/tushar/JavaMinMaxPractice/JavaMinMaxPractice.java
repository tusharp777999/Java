package com.tushar.JavaMinMaxPractice;

import java.util.Comparator;
import java.util.List;

import com.tushar.database.EmployeeDatabase;
import com.tushar.entity.Employee;

public class JavaMinMaxPractice {
	public static void main(String[] args) {
		
		//Loading data for stream manipulation.
		List<Employee> employees = EmployeeDatabase.getAllEmployees();
	
		//This sorts the Employee object data based on the Employee salary, by default it sorts based on the Natural sorting order.
		//Using this you can get the Lowest salary employee
		List<Employee> sortedAscEmployees = employees.stream().sorted(Comparator.comparing(Employee::getSalary)).toList();
		System.out.println(sortedAscEmployees.get(0));
		
		System.out.println("======================================================================================================================================================");
		
		//This sorts the Employee object data based on the Employee salary, by default it sorts based on the Natural sorting order but sorting in descending order.
		//Using this you can get the Highest salary employee
		List<Employee> sortedDescEmployees = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).toList();
		System.out.println(sortedDescEmployees.get(0));
		
		System.out.println("======================================================================================================================================================");
		
		//But above two approaches are not convenient, or the real solution. The use of min and max will be useful in this case.
		employees.stream().max(Comparator.comparing(Employee::getSalary)).ifPresentOrElse(employee -> System.out.println("Highest paid employee: " + employee),() -> {System.out.println("Not present");});
		
		System.out.println("======================================================================================================================================================");
		
		//or but in this approach it is possible that the optional can be empty so better and safe way is the above one only.
		Employee employeeData = employees.stream().max(Comparator.comparing(Employee::getSalary)).get();
		System.out.println(employeeData);
	}
}
