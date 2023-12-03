package com.batch.BatchLoader.Entity;

import org.springframework.data.annotation.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue
	private int id;
	private String firstName;
	private String lastName;
	private int age;
	private int salary;
	
	
}
