package com.tushar.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FindingDemo {
	public static void main(String[] args) {
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("David", 23, "India"));
		persons.add(new Person("Joy", 25, "USA"));
		persons.add(new Person("Ryan", 50, "Canada"));
		persons.add(new Person("Ram", 45, "India"));
		persons.add(new Person("Ching", 56, "China"));
		
		//It gives the first record from the multiple records and returns Optional as a return type because if it is null to handle null
		//scenario.
		Optional<Person> personFindFirst = persons.stream().findFirst();
		if(personFindFirst.isPresent()) {
			System.out.println(personFindFirst.get());
		}
		
		//findFirst() with filter.
		Optional<Person> personFindFirstWithFilter = persons.stream().filter(person -> person.getcountry().equals("India")).findFirst();
		if(personFindFirstWithFilter.isPresent()) {
			System.out.println(personFindFirstWithFilter.get());
		}
		
		//It gives any record which is present in the list
		Optional<Person> personFindAny = persons.stream().findAny();
		if(personFindAny.isPresent()) {
			System.out.println(personFindAny.get());
		}
		
		//It gives any record which is present in the filtered list
		Optional<Person> personFindAnyWithFilter = persons.stream().filter(person -> person.getcountry().equals("India")).findAny();
		if(personFindAnyWithFilter.isPresent()) {
			System.out.println(personFindAnyWithFilter.get());
		}
	}
}
