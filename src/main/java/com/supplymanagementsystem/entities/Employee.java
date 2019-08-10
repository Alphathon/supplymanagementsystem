package com.supplymanagementsystem.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "emp_Id")
	private long empId;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPrimarySkill() {
		return primarySkill;
	}

	public void setPrimarySkill(String primarySkill) {
		this.primarySkill = primarySkill;
	}

	public String getSecondrySkill() {
		return secondrySkill;
	}

	public void setSecondrySkill(String secondrySkill) {
		this.secondrySkill = secondrySkill;
	}

	public String getAvailabledate() {
		return availabledate;
	}

	public void setAvailabledate(String availabledate) {
		this.availabledate = availabledate;
	}

	@Column(name = "emp_Name")
	private String empName;
	@Column(name = "primary_Skill")
	private String primarySkill;
	@Column(name = "secondry_Skill")
	private String secondrySkill;
	@Column(name = "location")
	private String location;
	@Column(name = "exp")
	private String experience;
	@Column(name = "is_allocated")
	private String isAllocated;
	@Column(name = "avail_date")
	private String availabledate;

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getIsAllocated() {
		return isAllocated;
	}

	public void setIsAllocated(String isAllocated) {
		this.isAllocated = isAllocated;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", empId=" + empId + ", empName=" + empName + ", primarySkill=" + primarySkill
				+ ", secondrySkill=" + secondrySkill + ", location=" + location + ", experience=" + experience
				+ ", isAllocated=" + isAllocated + ", availabledate=" + availabledate + "]";
	}

}