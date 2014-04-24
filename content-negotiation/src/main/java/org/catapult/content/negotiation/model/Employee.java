package org.catapult.content.negotiation.model;

import java.util.UUID;


public class Employee {
	private String employeeId;
	private String firstName;
	private String lastName;

	public Employee() {
	}

	public Employee(String firstName, String lastName) {
		this.employeeId = UUID.randomUUID().toString();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public void setEmployeeId(final String employeeId) {
		this.employeeId = employeeId;
	}

	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}

	public String getEmployeeId() {
		return this.employeeId;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}
	
	@Override
	public String toString() {
		return this.employeeId + " - " + this.firstName + " - " + this.lastName;
	}

}