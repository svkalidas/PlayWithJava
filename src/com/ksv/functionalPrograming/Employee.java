package com.ksv.functionalPrograming;

public class Employee {

	private Integer empId;
	private String name;
	private String department;
	private Integer salary;

	public Employee() {

	}

	public Employee(Integer empId, String name, String department, Integer salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	
	public void setEmployee(Employee emp) {
		System.out.println(emp.getName());
	}
	
	public Employee update(Employee emp) {
		emp.setSalary(emp.getSalary()+10);
		return emp;
	}

}
