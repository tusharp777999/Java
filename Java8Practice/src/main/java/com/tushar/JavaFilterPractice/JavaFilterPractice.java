package com.tushar.JavaFilterPractice;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.tushar.database.EmployeeDatabase;
import com.tushar.entity.Employee;

public class JavaFilterPractice {
	public static void main(String[] args) {
		
		//filter take Predicate as an input which takes one input and returns boolean value have a [boolean test(T t)] this abstract method.
		//forEach take Consumer as an input which takes one input and returns void which means nothing and having a method [void accept(T t)] this abstract method.
		//toMap takes Function for both key and value which takes one input and return output [R apply(T t)] this abstract method.
		//limit takes long value and used to get the number of records. 
		
		//Loading data for stream manipulation.
		List<Employee> employees = EmployeeDatabase.getAllEmployees();
		
		//Filter employees based on the department name and print all data.
		employees.stream().filter(employeeData -> employeeData.getDept().equals("Development")).forEach(System.out::println);
		
		System.out.println("=====================================================================================================================================================");
		
		//Filter employees based on the department name and print only required data.
		employees.stream().filter(employeeData -> employeeData.getDept().equals("Development")).forEach(employee -> System.out.println(employee.getName() + " : " + employee.getSalary()));
	
		System.out.println("=====================================================================================================================================================");
	
		//Filter the employees based on the department name and create list and then print.
		List<Employee> employeeFilteredList = employees.stream().filter(employeeData -> employeeData.getDept().equals("Development")).toList();
		System.out.println(employeeFilteredList);
		
		System.out.println("=====================================================================================================================================================");
		
		//or
		List<Employee> employeeFilteredList2 = employees.stream().filter(employeeData -> employeeData.getDept().equals("Development")).collect(Collectors.toList());
		System.out.println(employeeFilteredList2);
		
		System.out.println("=====================================================================================================================================================");
		
		//Filter the employees based on the department name and create set and then print. But to remove duplicate in List of Employee we need to override  Employee class must correctly 
		//implement equals() and hashCode() — ideally based on a unique identifier (like id). but if you want purely based on stream you need some other logic.
		Set<Employee> employeeFilteredSetList = employees.stream().filter(employeeData -> employeeData.getDept().equals("Development")).collect(Collectors.toSet());
		System.out.println(employeeFilteredSetList);
		
		System.out.println("=======================================================================================================================================================");
		
		//Filter the employees based on the department name and create Map key as employee name and value as a employee department and then print.
		Map<String, String> employeeFilteredMap = employees.stream().filter(employeeData -> employeeData.getDept().equals("Development")).collect(Collectors.toMap(empKey -> empKey.getName(), empValue -> empValue.getDept()));
		System.out.println(employeeFilteredMap);
		
		System.out.println("=======================================================================================================================================================");
		
		//or (Used method reference)
		Map<String, String> employeeFilteredMap1 = employees.stream().filter(employeeData -> employeeData.getDept().equals("Development")).collect(Collectors.toMap(Employee::getName, Employee::getDept));
		System.out.println(employeeFilteredMap1);
		
		System.out.println("=======================================================================================================================================================");
		
		//Filter the employees based on the department name and salary should be greater than 60K and then print.
		List<Employee> employeeListMultipleFilterCondition = employees.stream().filter(employeeData -> employeeData.getDept().equals("Development") && employeeData.getSalary() > 60000).toList();
		System.out.println(employeeListMultipleFilterCondition);
		
		System.out.println("=======================================================================================================================================================");
		
		//Filter the employees based on the department name and salary should be greater than 60K and then print.
		List<Employee> employeeListMultipleFilterConditionWithLimit = employees.stream().filter(employeeData -> employeeData.getDept().equals("Development") && employeeData.getSalary() > 60000).limit(1).toList();
		System.out.println(employeeListMultipleFilterConditionWithLimit);
	
	}
}
