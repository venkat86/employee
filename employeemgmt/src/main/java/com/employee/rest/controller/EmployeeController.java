package com.employee.rest.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Employee;
import com.employee.service.EmployeeService;

@RestController
public class EmployeeController {

	@Resource 
	private EmployeeService service;
	
    @RequestMapping("/welcome")
    String home() {
    	//EmployeeService service = new EmployeeServiceImpl();
    	
    	service.create(null);
        return "Hello World 123!";
    }
    
    @RequestMapping("/create-employee" )
    public String createEmployee(){
    	Employee emp = new Employee();
    	emp.setName("venkat");
    	emp.setEmail("venkat@gmail.com");
    	// service call
    	service.create(emp);
    	return "employee";
    }
    
}
