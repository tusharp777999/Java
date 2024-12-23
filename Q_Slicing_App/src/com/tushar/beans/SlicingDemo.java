package com.tushar.beans;

import java.util.ArrayList;
import java.util.List;

public class SlicingDemo {
	public static void main(String[] args) {
		List<String> countries = new ArrayList<String>();
		countries.add("India");
		countries.add("USA");
		countries.add("UK");
		countries.add("China");
		countries.add("India");
		countries.add("USA");
		
		//Use of unique to remove duplicates.
		countries.stream().distinct().forEach(System.out::println);
		
		//Use of limit to show the selected records.
		countries.stream().limit(3).forEach(System.out::println);
		
		//Use of skip the number of elements from starting and return remaining.
		countries.stream().skip(4).forEach(System.out::println);
	}
}
