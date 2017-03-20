package com.dao;

import java.util.List;

import javax.persistence.NoResultException;

import com.domain.hibernate.EmployeeTimeOffVO;

public interface EmployeeTimeOffDao {
	/**Insert an item*/
	public void addEmployeeTimeOff(EmployeeTimeOffVO event);
	
	/**Update an item*/
	public void updateEmployeeTimeOff(EmployeeTimeOffVO event);
	
	/**Gets all events from the database*/
	public List<EmployeeTimeOffVO> getAllEmployeeTimeOffs(); 
	
	/**Gets an items given the item Id*/
	public List<EmployeeTimeOffVO> getEmployeeTimeOffsByUserId(int userId) throws NoResultException;
}
