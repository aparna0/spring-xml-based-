package com.aparna.employeeSystem;

public class Employee {
	int empNo;
	String empName;
	float salary;
	Department dept;
	public Employee() {
		super();
	}
	public Employee(int empNo, String empNam, float salary, Department dept) {
		super();
		this.empNo = empNo;
		this.empName = empNam;
		this.salary = salary;
		this.dept = dept;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empNam) {
		this.empName = empNam;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", salary=" + salary + ", dept=" + dept + "]";
	}
	
}
