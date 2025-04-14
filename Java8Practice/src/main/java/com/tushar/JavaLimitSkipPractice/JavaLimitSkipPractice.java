package com.tushar.JavaLimitSkipPractice;

import java.util.Comparator;
import java.util.List;

import com.tushar.database.EmployeeDatabase;
import com.tushar.entity.Employee;

public class JavaLimitSkipPractice {
	public static void main(String[] args) {
		
		//Loading data for stream manipulation.
		List<Employee> employees = EmployeeDatabase.getAllEmployees();
		
		//limit() will give us the number of required objects only.
		List<Employee> employeeLimitList = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(3).toList();
		System.out.println(employeeLimitList);
		
		//skip() it skips the number of objects. If it is present.
		List<Employee> skippedEmployeeList = employees.stream().skip(5).toList();
		System.out.println(skippedEmployeeList);
		
	}
}
