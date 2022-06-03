package com.careerinfotech.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.careerinfotech.employee.entity.Employee;
import com.careerinfotech.employee.repository.EmployeeRepo;

@Service
public class ServiceEmployer {
	
	@Autowired
	private EmployeeRepo empRepo;
	
	public List<Employee> findAllEmployee() {
		return empRepo.findAll();
	}
	
	public Employee saveEmployee(Employee employee) {
		return empRepo.save(employee);
	}

}
