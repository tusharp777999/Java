package com.tushar.beans;

import java.util.Arrays;
import java.util.List;

public class FlatMapDemo {
	public static void main(String[] args) {
		List<String> javaCourses = Arrays.asList("Core Java", "Adv Java", "SBMS", "JRTP");
		List<String> uiCourses = Arrays.asList("HTML", "CSS 3", "Angular", "React JS");
		List<String> cloudCourses = Arrays.asList("DevOps", "AWS", "Azure", "GCP");
		
		List<List<String>> courses = Arrays.asList(javaCourses, uiCourses, cloudCourses);
		courses.stream().flatMap(course -> course.stream()).forEach(System.out::println);
	}
}
