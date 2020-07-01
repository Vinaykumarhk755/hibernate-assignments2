package com.dxc.hibernateassignment2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Manager")
public class Manager {
	@Id
	@Column(name="managerId")
	private long managerId;
	private String name; 
	
	@ManyToOne
	@JoinColumn(name="department_id")
	private Department department;
	
	
	
	public Manager(long managerId, String name, Department department) {
		super();
		this.managerId = managerId;
		this.name = name;
		this.department = department;
	}
	public long getManagerId() {
		return managerId;
	}
	public void setManagerId(long managerId) {
		this.managerId = managerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
}
