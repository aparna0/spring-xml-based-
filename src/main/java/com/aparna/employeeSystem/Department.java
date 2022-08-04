package com.aparna.employeeSystem;

public class Department {

	int deptId;
	String deptName;
	public Department() {
		super();
	}
	public Department(int deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	@Override
	public String toString() {
		return "Deprtment [deptId=" + deptId + ", deptName=" + deptName + "]";
	}
	
}
