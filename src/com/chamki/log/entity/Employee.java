package com.chamki.log.entity;

import java.util.Date;

public class Employee {

	private Integer id;
	
	private String name;
	
	private String age;
	
	private Date employedDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public Date getEmployedDate() {
		return employedDate;
	}

	public void setEmployedDate(Date employedDate) {
		this.employedDate = employedDate;
	}
}
