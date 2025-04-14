package com.tushar.JavaAnyMatchAllMatchNoneMatchPractice;

import java.util.List;

import com.tushar.database.EmployeeDatabase;
import com.tushar.entity.Employee;

public class JavaAnyMatchAllMatchNoneMatchPractice {
	public static void main(String[] args) {
		
		//Loading data for stream manipulation.
		List<Employee> employees = EmployeeDatabase.getAllEmployees();
		
		//anyMatch() it checks any of the matched data is present or not based on that it returns true or false.
		//Here we used matched data. If any single record matches it returns true otherwise false.
		boolean isAnyEmployeeBelongToDevelopment = employees.stream().anyMatch(employeeData -> employeeData.getDept().equals("Development"));
		System.out.println(isAnyEmployeeBelongToDevelopment);
		
		//Here we used un-matched data i.e Xyz as a department name.
		boolean isAnyEmployeeBelongToXyz = employees.stream().anyMatch(employeeData -> employeeData.getDept().equals("Xyz"));
		System.out.println(isAnyEmployeeBelongToXyz);
		
		//allMatch() returns true if all the Employee belongs to Development department. If this is the case then it will return the true.
		//but here as we know all Employees are not belonging to the Development department. So it returns false. 
		boolean isAllEmployeeBelongToDevelopment = employees.stream().allMatch(employeeData -> employeeData.getDept().equals("Development"));
		System.out.println(isAllEmployeeBelongToDevelopment);
		
		//allMatch() returns true if all the Employee salary greater than 50000. If this is the case then it will return the true.
		//but here as we know all Employees salary is greater than 50000. So it will return true.
		boolean isAllEmployeeSalaryGreaterThan50000 = employees.stream().allMatch(employeeData -> employeeData.getSalary() > 50000);
		System.out.println(isAllEmployeeSalaryGreaterThan50000);
		
		//noneMatch() returns true if no match found in the entire data oterwise it returns false. So here we have Development as a department in our data so it will
		//returns false.
		boolean isAllEmployeeNotBelongToDevelopment = employees.stream().noneMatch(employeeData -> employeeData.getDept().equals("Development"));
		System.out.println(isAllEmployeeNotBelongToDevelopment);
		
		//noneMatch() returns true if no match found in the entire data oterwise it returns false. So here we have Development as a department in our data so it will
		//returns false.
		boolean isAllEmployeeNotBelongToAbc = employees.stream().noneMatch(employeeData -> employeeData.getDept().equals("Abc"));
		System.out.println(isAllEmployeeNotBelongToAbc);
		
	}
}
