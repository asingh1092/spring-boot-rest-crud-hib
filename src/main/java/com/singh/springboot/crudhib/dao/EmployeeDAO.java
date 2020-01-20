package com.singh.springboot.crudhib.dao;

import java.util.List;

import com.singh.springboot.crudhib.entity.Employee;

public interface EmployeeDAO {
	
	public List<Employee> findAll();

}
