package com.careerinfotech.employee.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long employeeId;
	private String firstname;
	private String lastname;
	private String email;
	private int salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employee(Long employeeId, String firstname, String lastname, String email, int salary) {
		super();
		this.employeeId = employeeId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstname=" + firstname + ", lastname=" + lastname + ", email="
				+ email + ", salary=" + salary + "]";
	}
	
	

}
