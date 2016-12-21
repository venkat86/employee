package com.employee.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.employee.model.Employee;

public interface EmployeeService {

	Employee create(Employee emp);
	
	Employee update(Employee emp);
	
	Employee delete(Employee emp);
	
	
}
