package com.tushar.beans;

public class Person {
	
	private String name;
	
	private Integer age;
	
	private String country;

	public Person() {
		super();
	}

	public Person(String name, Integer age, String country) {
		super();
		this.name = name;
		this.age = age;
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getcountry() {
		return country;
	}

	public void setcountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", country=" + country + "]";
	}
	
}
