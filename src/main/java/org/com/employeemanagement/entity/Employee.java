package org.com.employeemanagement.entity;

public class Employee {

	private int empId;

	private String employeeName;

	private int age;

	private String employeeRole;

	private int yrsOfExperience;

	private Address address;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmployeeRole() {
		return employeeRole;
	}

	public void setEmployeeRole(String employeeRole) {
		this.employeeRole = employeeRole;
	}

	public int getYrsOfExperience() {
		return yrsOfExperience;
	}

	public void setYrsOfExperience(int yrsOfExperience) {
		this.yrsOfExperience = yrsOfExperience;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
