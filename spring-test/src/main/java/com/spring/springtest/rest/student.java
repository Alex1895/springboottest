package com.spring.springtest.rest;

import java.time.LocalDate;

public class student {
	private long id;
	private String name;
	private String email;
	private int age;
	private LocalDate dob;
	
	public student() {
		
	}

	public student(long id, String name, String email, int age, LocalDate dob) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.age = age;
		this.dob = dob;
	}

	public student(String name, String email, int age, LocalDate dob) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
		this.dob = dob;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", email=" + email + ", age=" + age + ", dob=" + dob + "]";
	}
	
	
}
