package com.Restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.Restapi.model.Employee;
import com.Restapi.service.Employeeservice;

@RestController
public class EmployeeController {
	
	
	@Autowired
     private Employeeservice employeeservice; 
	
	@GetMapping("/fun")
	public String fun()
	{
		return"AESZrxdtcfgbhlkm;,";
	}
	
	
	@GetMapping("/employees")
	public List<Employee> getEmployees()
	{
		
		return this.employeeservice.getEmployee();
	}
	
	@GetMapping("/employee/{id}")
	public Employee getEmployee(@PathVariable String id)
	{
		
		return this.employeeservice.getemployee(Long.parseLong(id));
	}
	
	

}
