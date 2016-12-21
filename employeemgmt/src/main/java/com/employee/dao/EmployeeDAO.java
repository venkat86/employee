package com.employee.dao;

import com.employee.model.Employee;

public interface EmployeeDAO {

	Employee create(Employee emp);
	
	Employee update(Employee emp);
	
	Employee delete(Employee emp);
	
}
