package com.tushar.beans;

import java.util.ArrayList;
import java.util.List;

public class MatchingDemo {
	public static void main(String[] args) {
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("David", 23, "India"));
		persons.add(new Person("Joy", 25, "USA"));
		persons.add(new Person("Ryan", 50, "Canada"));
		persons.add(new Person("Ram", 45, "India"));
		persons.add(new Person("Ching", 56, "China"));

		//If any single record match it returns true otherwise false and it is a terminal operation.
		boolean isIndiaPresentAnyMatch = persons.stream().anyMatch(person -> person.getcountry().equals("India"));
		System.out.println(isIndiaPresentAnyMatch);
		
		//If all records matches then it returns true otherwise false and it is a terminal operation.
		boolean isIndiaPresentAllMatch = persons.stream().allMatch(person -> person.getcountry().equals("India"));
		System.out.println(isIndiaPresentAllMatch);
		
		//If no records matches then it returns true otherwise false and it is a terminal operation.
		boolean isGermanyPresentAllMatch = persons.stream().noneMatch(person -> person.getcountry().equals("Germany"));
		System.out.println(isGermanyPresentAllMatch);
	}
}
