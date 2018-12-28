package com.cs.practice;

public class Employee {

	String name;
	int empId;
	DepartMent dept;

	public Employee() {

	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public DepartMent getDept() {
		return dept;
	}
	
	public void setDept(DepartMent dept) {
		this.dept = dept;
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Employee Name : " + name + "\tEmployee Id : " + empId + "DeptId :" + dept.deptId + "DeptName :"
				+ dept.deptName;
	}
	
	/*public Employee(int empId, String name, DepartMent dept) {
		this.name = name;
		this.empId = empId;
		this.dept = dept;
		System.out.println("Employee Parameterized Constructor\n"+toString());
	}*/
	
	
}
