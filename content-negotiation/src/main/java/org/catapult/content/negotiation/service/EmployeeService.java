package org.catapult.content.negotiation.service;

import java.util.ArrayList;
import java.util.List;

import org.catapult.content.negotiation.model.Employee;
import org.catapult.content.negotiation.model.Employees;

public class EmployeeService {
	
	
	public Employees list() {
		Employees employees = new Employees();
		employees.setEmployees(new ArrayList<Employee>());
		employees.getEmployees().add(new Employee("Jame", "Bond 1"));
		employees.getEmployees().add(new Employee("Jame", "Bond 2"));
		employees.getEmployees().add(new Employee("Jame", "Bond 3"));
		employees.getEmployees().add(new Employee("Jame", "Bond 4"));
		employees.getEmployees().add(new Employee("Jame", "Bond 5"));
		employees.getEmployees().add(new Employee("Jame", "Bond 6"));
		employees.getEmployees().add(new Employee("Jame", "Bond 7"));
		employees.getEmployees().add(new Employee("Jame", "Bond 8"));
		employees.getEmployees().add(new Employee("Jame", "Bond 9"));
		employees.getEmployees().add(new Employee("Jame", "Bond 10"));
		return employees;
	}

}
