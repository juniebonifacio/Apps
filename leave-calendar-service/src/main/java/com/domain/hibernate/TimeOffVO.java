package com.domain.hibernate;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "TIMEOFF")
public class TimeOffVO {

	@Id 
	@GeneratedValue
	@Column(name="TIMEOFF_ID")
	private int id;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="DESCRIPTION")
	private String description;

	@OneToMany(orphanRemoval=true, fetch=FetchType.LAZY, 
				targetEntity=EmployeeTimeOffVO.class, mappedBy="timeOff")
	@JsonManagedReference
	private List<EmployeeTimeOffVO> listOfEmployeeTimeOffs; //One Kind of TimeOff can be requested by many Employees. i.e. VL, SL.
	
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
	 * @return the listOfEmployeeTimeOffs
	 */
	public List<EmployeeTimeOffVO> getListOfEmployeeTimeOffs() {
		return listOfEmployeeTimeOffs;
	}

	/**
	 * @param listOfEmployeeTimeOffs the listOfEmployeeTimeOffs to set
	 */
	public void setListOfEmployeeTimeOffs(List<EmployeeTimeOffVO> listOfEmployeeTimeOffs) {
		this.listOfEmployeeTimeOffs = listOfEmployeeTimeOffs;
	}
	
}
