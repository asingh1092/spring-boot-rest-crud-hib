package com.singh.springboot.crudhib.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.singh.springboot.crudhib.dao.EmployeeDAO;
import com.singh.springboot.crudhib.entity.Employee;

@Controller
@RequestMapping("/api")
public class EmployeeRestController {
	
	// inject employee dao - will make service later
	private EmployeeDAO employeeDAO;
	
	@Autowired
	public EmployeeRestController(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}
	
	// expose /employees and return list of employees
	@GetMapping("/employees")
	public List<Employee> findAll() {
		return employeeDAO.findAll();
	}
}
