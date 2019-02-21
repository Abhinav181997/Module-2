package com.capgemini.JPQLexamaple;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Emp")
public class Employee {
	
	@Id
	private int EmpNo;
	private String EName;
	private int Sal;
	private int DeptNo;
	private String job;
	
	public int getEmpNo() {
		return EmpNo;
	}
	public void setEmpNo(int empNo) {
		EmpNo = empNo;
	}
	public String getEName() {
		return EName;
	}
	public void setEName(String eName) {
		EName = eName;
	}
	public int getSal() {
		return Sal;
	}
	public void setSal(int sal) {
		Sal = sal;
	}
	public int getDeptNo() {
		return DeptNo;
	}
	public void setDeptNo(int deptNo) {
		DeptNo = deptNo;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	
	@Override
	public String toString() {
		return "Employee [EmpNo=" + EmpNo + ", EName=" + EName + ", Salary=" + Sal + ", DeptNo=" + DeptNo + ", job="
				+ job + "]";
	}

		
}
