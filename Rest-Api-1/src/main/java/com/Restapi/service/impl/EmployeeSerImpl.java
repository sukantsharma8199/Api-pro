package com.Restapi.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Restapi.model.Employee;
import com.Restapi.service.Employeeservice;

@Service
public class EmployeeSerImpl implements Employeeservice {
	
	List<Employee> list;
	public EmployeeSerImpl()
	{
		list =new ArrayList<>();
		list.add(new Employee(11,"sukant","sharma","suk@gmail"));
		list.add(new Employee(12,"sukant2","sharma2","suk@gmail2"));
	}
	

	@Override
	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
		return list;
	}


	@Override
	public Employee getemployee(long id) {
		Employee e=null;
		
		for(Employee employee: list)
		{
			if(employee.getId()== id)
			{
				e=employee;
				break;
			}
		}
		
		return e;
	}

}
