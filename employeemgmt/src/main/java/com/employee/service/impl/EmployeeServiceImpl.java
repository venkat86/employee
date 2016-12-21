package com.employee.service.impl;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.employee.dao.EmployeeDAO;
import com.employee.model.Employee;
import com.employee.service.EmployeeService;

@Component
public class EmployeeServiceImpl implements EmployeeService{

	private static Logger log = Logger.getLogger(EmployeeService.class);
	
	@Resource
	EmployeeDAO employeeDAO;
	
	@Override
	public Employee create(Employee emp) {
		// TODO Auto-generated method stub
		log.debug("Welcome to logging");
		System.out.println("Server logs ");
		employeeDAO.create(emp);
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
