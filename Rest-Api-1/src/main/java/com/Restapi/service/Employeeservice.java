package com.Restapi.service;

import java.util.List;

import com.Restapi.model.Employee;

public interface Employeeservice {
	
	public List<Employee> getEmployee();
	public Employee getemployee(long id);
	

}
