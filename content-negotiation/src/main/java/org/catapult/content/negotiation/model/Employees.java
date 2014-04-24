package org.catapult.content.negotiation.model;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employees  {
   
	private Collection<Employee> employees;
    public Employees() {
    }    
	
    public Collection<Employee> getEmployees() {
        return employees;
    }
 
    public void setEmployees(Collection<Employee> employees) {
        this.employees = employees;
    }
}