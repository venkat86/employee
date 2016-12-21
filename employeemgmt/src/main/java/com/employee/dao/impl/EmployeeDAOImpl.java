package com.employee.dao.impl;

import org.springframework.stereotype.Component;

import com.employee.dao.EmployeeDAO;
import com.employee.model.Employee;

@Component
public class EmployeeDAOImpl  implements EmployeeDAO{

	@Override
	public Employee create(Employee emp) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to server logs in dao ");
		return null;
	}

	@Override
	public Employee update(Employee emp) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee delete(Employee emp) {
		// TODO Auto-generated method stub
		return null;
	}

}
