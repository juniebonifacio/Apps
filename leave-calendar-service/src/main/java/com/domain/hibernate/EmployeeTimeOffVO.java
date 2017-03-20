package com.domain.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE_TIMEOFF")
public class EmployeeTimeOffVO {

	@Id 
	@GeneratedValue
	@Column(name="EMPLOYEE_TIMEOFF_ID")
	private int id;
	
	@Column(name="USER_ID")
	private int userId;
	
	@Column(name="TIMEOFF_ID")
	private int timeOffId;
	
	@Column(name="DESCRIPTION")
	private String description;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * @return the timeOffId
	 */
	public int getTimeOffId() {
		return timeOffId;
	}

	/**
	 * @param timeOffId the timeOffId to set
	 */
	public void setTimeOffId(int timeOffId) {
		this.timeOffId = timeOffId;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
