package com.tushar.beans;

import java.util.Arrays;
import java.util.List;

public class MarriagePortal {
	public static void main(String[] args) {
		Person p1 = new Person("Raju", "Software", 6301921083L);
		Person p2 = new Person("Gopi", "Chef", 789767899L);
		Person p3 = new Person("Mahesh", "Photographer", 668621083L);
		Person p4 = new Person("Sunil", "Driver", 47575721083L);
		Person p5 = new Person("David", "Teacher", 5678921083L);
		Person p6 = new Person("Ashok", "Software", 630192178L);
		
		List<Person> persons = Arrays.asList(p1, p2, p3, p4, p5, p6);
		
		//Give me person name with number who is doing software job.
		persons.stream().filter(person -> person.getJob().equals("Software")).map(person -> person.getName() + " : " + person.getPhoneNumber()).forEach(System.out::println);
	}
}
