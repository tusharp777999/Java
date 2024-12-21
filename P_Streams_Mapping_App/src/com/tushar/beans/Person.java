package com.tushar.beans;

public class Person {
	
	private String name;
	
	private String job;
	
	private Long phoneNumber;

	public Person() {
		super();
	}

	public Person(String name, String job, Long phoneNumber) {
		super();
		this.name = name;
		this.job = job;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", job=" + job + ", phoneNumber=" + phoneNumber + "]";
	}
	
}
