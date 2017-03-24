package com.domain.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "EMPLOYEE_TIMEOFF")
public class EmployeeTimeOffVO {

	@Id 
	@GeneratedValue
	@Column(name="EMPLOYEE_TIMEOFF_ID")
	private int id;
	
	/** User Id where this TimeOff belongs */
	@Column(name = "OWNER_ID")
	private int ownerId;
	
	@Column(name="TIMEOFF_ID")
	private int timeOffId;
	
	@Column(name="DESCRIPTION")
	private String description;

    @ManyToOne(optional=false, targetEntity=UserVO.class)
    @JoinColumn(name="OWNER_ID", referencedColumnName="USER_ID", insertable=false, updatable=false)
    @JsonBackReference
    private UserVO user; //Back Reference To User: One TimeOff has an Owner.
    
    @ManyToOne(optional=false, targetEntity=TimeOffVO.class)
    @JoinColumn(name="TIMEOFF_ID", referencedColumnName="TIMEOFF_ID", insertable=false, updatable=false)
    @JsonBackReference
	private TimeOffVO timeOff; //Back Reference To TimeOff: One EmployeeTimeOff is under a certain Type of TimeOff i.e. SL, VL.
	
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
	 * @return the ownerId
	 */
	public int getOwnerId() {
		return ownerId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
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

	/**
	 * @return the user
	 */
	public UserVO getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(UserVO user) {
		this.user = user;
	}

	/**
	 * @return the timeOff
	 */
	public TimeOffVO getTimeOff() {
		return timeOff;
	}

	/**
	 * @param timeOff the timeOff to set
	 */
	public void setTimeOff(TimeOffVO timeOff) {
		this.timeOff = timeOff;
	}
	
	
}
