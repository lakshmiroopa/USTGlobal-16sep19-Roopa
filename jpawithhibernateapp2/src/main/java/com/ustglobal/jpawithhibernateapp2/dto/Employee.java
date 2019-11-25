package com.ustglobal.jpawithhibernateapp2.dto;

import javax.persistence.*;

@Entity
public class Employee {
	
	@Id
	@Column
	private int eid;
	@Column
	private String ename;
	@Column
	private int salary;
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	

}
