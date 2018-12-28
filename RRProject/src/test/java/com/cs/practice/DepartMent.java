package com.cs.practice;

public class DepartMent {

	int deptId;
	String deptName;

	public DepartMent() {
	
	}
	
	public DepartMent(int deptId, String deptName) {
		this.deptId =  deptId;
		this.deptName = deptName;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
		System.out.println(toString());
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	@Override
	public String toString() {
		return "DeptId : "+deptId +"\tDeptName : "+ deptName;
	}
	
}
