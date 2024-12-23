package com.tushar.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByDemo {
	public static void main(String[] args) {
		List<User> users = new ArrayList<User>();
		users.add(new User("Ram", 10000, "India"));
		users.add(new User("Anil", 20000, "Canada"));
		users.add(new User("Sunil", 30000, "India"));
		users.add(new User("Orlen", 40000, "Japan"));
		users.add(new User("Cathie", 50000, "UK"));
		users.add(new User("Ching Chong", 10000, "China"));
		
		Map<String, List<User>> usersGroupingByCountry = users.stream().collect(Collectors.groupingBy(User::getCountry));
		System.out.println(usersGroupingByCountry);
	}
}
