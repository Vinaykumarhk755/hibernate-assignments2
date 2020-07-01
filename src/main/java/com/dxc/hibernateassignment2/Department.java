package com.dxc.hibernateassignment2;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Department")
public class Department {
	@Id
	@Column(name="department_id")
	private long department_id; 
	@Column(length=20)
	private String	departmentName;

	@OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
	private Set<Manager> managers;

	public long getDeptId() {
		return department_id;
	}

	public void setDeptId(long department_id) {
		this.department_id = department_id;
	}

	public String getDeptName() {
		return departmentName;
	}

	public void setDeptName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Set<Manager> getManagers() {
		return managers;
	}

	public void setmanagers(Set<Manager> managers) {
		this.managers = managers;
	}



}
