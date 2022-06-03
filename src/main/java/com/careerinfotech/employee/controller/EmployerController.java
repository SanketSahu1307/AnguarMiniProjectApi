package com.careerinfotech.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.careerinfotech.employee.entity.Employee;
import com.careerinfotech.employee.service.ServiceEmployer;

@RestController
public class EmployerController {
	
	@Autowired
	private ServiceEmployer empServ;
	
	@RequestMapping("/hello")
	public String helloEmpoyeeMsg() {
		return "Hello Employee, I hope all are good...";
	}
	
	@GetMapping("/allEmployee")
	public List<Employee> getAllEmployerDetails() {
		return empServ.findAllEmployee();
	}
	
	@PostMapping("/save")
	public Employee postAllEmployerDetail(@RequestBody Employee employee) {
		return empServ.saveEmployee(employee);
	}
	
	
	

}
