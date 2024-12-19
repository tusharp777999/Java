package com.tushar.beans;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateJoinForOr {
	public static void main(String[] args) {
		Person p1 = new Person("Raju", 21);
		Person p2 = new Person("Chetan", 23);
		Person p3 = new Person("Anil", 67);
		Person p4 = new Person("Gita", 14);
		Person p5 = new Person("Suchitra", 26);
		
		List<Person> persons = Arrays.asList(p1, p2, p3, p4, p5);
		
		Predicate<Person> ageLowerUpperLimit = person -> person.getAge() >= 21 || person.getAge() <= 64;
		
		// Here it we are using the conditional operator within single Predicate.
		System.out.println("Predicate with single condition:");
				
		for(Person person : persons) {
			if(ageLowerUpperLimit.test(person)) {
				System.out.println(person);
			}
		}
		
		
		Predicate<Person> ageLowerLimit = person -> person.getAge() >= 21;
		
		Predicate<Person> ageUpperLimit = person -> person.getAge() <= 64;
		
		// Here it we are using the conditional operator which shows a lengthy approach.
		System.out.println("Predicate without joining methods:");
		
		for(Person person : persons) {
			if(ageLowerLimit.test(person) || ageUpperLimit.test(person)) {
				System.out.println(person);
			}
		}
		
		// Here we are using the Predicate joining.
		Predicate<Person> predicate = ageLowerLimit.or(ageUpperLimit);
		System.out.println("Predicate with joining mehtods:");
		
		for(Person person : persons) {
			if(predicate.test(person)) {
				System.out.println(person);
			}
		}		
	}
}
