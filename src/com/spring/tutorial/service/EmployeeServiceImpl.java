package com.spring.tutorial.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.tutorial.dao.EmployeeRepository;
import com.spring.tutorial.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public Employee create(Employee employee) {
		// TODO Auto-generated method stub
		Employee emp = employee;
		return (Employee) employeeRepository.save(emp);
	}

	@Override
	public List<Employee> findById(int id) {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

}
