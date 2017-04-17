package com.business;

import java.util.List;

import javax.persistence.NoResultException;

import com.domain.business.EmployeeTimeOffBO;

public interface EmployeeTimeOffBusiness {
	/**Insert an Employee TimeOff*/
	public void addEmployeeTimeOff(EmployeeTimeOffBO timeOff);
	
	/**Update an Employee TimeOff*/
	public void updateEmployeeTimeOff(EmployeeTimeOffBO timeOff);
	
	/**Gets all Employee TimeOff from the database*/
	public List<EmployeeTimeOffBO> getAllEmployeeTimeOffs(); 
	
	/**Gets an Employee TimeOff given the item Id*/
	public List<EmployeeTimeOffBO> getEmployeeTimeOffsByUserId(int userId) throws NoResultException;
}
