package com.employee.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.time.LocalDateTime;

public class Employee implements Serializable{

	private Long id;
	
	private String name;
	
	private String email;
	
	private String phoneNumber;
	
	private LocalDateTime joiningDate;
	
	private LocalDateTime dob;
	
	private String projectName;
	
	private String panCard;
	
	private BigInteger empNumber;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public LocalDateTime getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(LocalDateTime joiningDate) {
		this.joiningDate = joiningDate;
	}

	public LocalDateTime getDob() {
		return dob;
	}

	public void setDob(LocalDateTime dob) {
		this.dob = dob;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getPanCard() {
		return panCard;
	}

	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}

	public BigInteger getEmpNumber() {
		return empNumber;
	}

	public void setEmpNumber(BigInteger empNumber) {
		this.empNumber = empNumber;
	}

	
}
