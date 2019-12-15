package com.techteam.springBootDockerMysql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techteam.springBootDockerMysql.model.Employee;
import com.techteam.springBootDockerMysql.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository empRepository;

	public Employee save(Employee emp) {
		return empRepository.save(emp);
	}

	public List<Employee> getAll() {
		return empRepository.findAll();
	}
	

}
