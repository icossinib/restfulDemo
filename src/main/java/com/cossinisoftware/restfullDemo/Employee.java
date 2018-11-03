package com.cossinisoftware.restfullDemo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Employee {

	private @Id @GeneratedValue Long id;
	private String firstName;
	private String surname;
	private String role;

	public Employee(String firstName, String surname, String role) {
		this.firstName = firstName;
		this.surname = surname;
		this.role = role;
	}

	public Employee(String name, String role){
		this.setName(name);
		this.role = role;
	}

	public void setName(String name) {
		String splittedName[] = name.split(" ");
		this.firstName = splittedName[0];
		this.surname = splittedName[1];
	}

	public String getName() {
		return firstName + " " + surname;
	}
}
