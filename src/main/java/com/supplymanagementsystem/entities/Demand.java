package com.supplymanagementsystem.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "demand")
public class Demand {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "demand_id")
	private long demandId;
	@Column(name = "primary_skill")
	private String primarySkill;
	@Column(name = "secondary_skill")
	private String secondarySkill;
	@Column(name = "experience")
	private String experience;
	@Column(name = "location")
	private String location;
	@Column(name = "status")
	private String status;
	@Column(name = "requested_by")
	private String requestedBy;
	@Column(name = "requested_date")
	private Date requestedDate;
	@Column(name = "start_by_date")
	private Date startByDate;
	@Column(name = "no_of_resources")
	private int noOfResources;

	public long getDemandId() {
		return demandId;
	}

	public void setDemandId(long demandId) {
		this.demandId = demandId;
	}

	public String getPrimarySkill() {
		return primarySkill;
	}

	public void setPrimarySkill(String primarySkill) {
		this.primarySkill = primarySkill;
	}

	public String getSecondarySkill() {
		return secondarySkill;
	}

	public void setSecondarySkill(String secondarySkill) {
		this.secondarySkill = secondarySkill;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRequestedBy() {
		return requestedBy;
	}

	public void setRequestedBy(String requestedBy) {
		this.requestedBy = requestedBy;
	}

	public Date getRequestedDate() {
		return requestedDate;
	}

	public void setRequestedDate(Date requestedDate) {
		this.requestedDate = requestedDate;
	}

	public int getNoOfResources() {
		return noOfResources;
	}

	public void setNoOfResources(int noOfResources) {
		this.noOfResources = noOfResources;
	}

	@Override
	public String toString() {
		return "Demand [demandId=" + demandId + ", primarySkill=" + primarySkill + ", secondarySkill=" + secondarySkill
				+ ", experience=" + experience + ", location=" + location + ", status=" + status + ", requestedBy="
				+ requestedBy + ", requestedDate=" + requestedDate + ", noOfResources=" + noOfResources + "]";
	}

}
