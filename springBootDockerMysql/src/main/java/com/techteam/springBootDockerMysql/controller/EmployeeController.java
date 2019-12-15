package com.techteam.springBootDockerMysql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.techteam.springBootDockerMysql.model.Employee;
import com.techteam.springBootDockerMysql.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService empService;

	@PostMapping("/save")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee emp){
		return ResponseEntity.ok(empService.save(emp));
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Employee>> getAll(){
		return ResponseEntity.ok(empService.getAll());
	}
}
