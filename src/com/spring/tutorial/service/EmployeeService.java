package com.spring.tutorial.service;

import java.util.List;

import com.spring.tutorial.model.Employee;

public interface EmployeeService {
	public Employee create(Employee employee);
	public List<Employee> findById(int id);
}
