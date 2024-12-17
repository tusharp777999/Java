package com.tushar.beans;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ObjectSorting1 {
	public static void main(String[] args) {
		Person p1 = new Person(101, "Nick", "nick@ashokit.in");
		Person p2 = new Person(102, "Orlen", "orlen@ashokit.in");
		Person p3 = new Person(103, "John", "john@ashokit.in");
		Person p4 = new Person(104, "Charles", "charles@ashokit.in");
		Person p5 = new Person(105, "Smith", "smith@ashokit.in");
		
		List<Person> persons = Arrays.asList(p1, p2, p3, p4, p5);
		
		System.out.println("=====Objects before sorting=====");
		for(Person p : persons) {
			System.out.println(p);
		}
		
		Collections.sort(persons, new PersonComparator());
		System.out.println("=====Objects after sorting=====");
		for(Person p : persons) {
			System.out.println(p);
		}
	}
}

class PersonComparator implements Comparator<Person> {
	@Override
	public int compare(Person o1, Person o2) {
		return o1.getPersonName().compareTo(o2.getPersonName());
	}
}
