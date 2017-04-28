package com.business;

import java.util.List;

import javax.persistence.NoResultException;

import com.domain.business.TimeOffBO;

public interface TimeOffBusiness {

	/**Insert an item*/
	public void addTimeOffType(TimeOffBO timeOff);
	
	/**Update an item*/
	public void updateTimeOff(TimeOffBO timeOff);
	
	/**Gets all events from the database*/
	public List<TimeOffBO> getAllTimeOffs(); 
	
	/**Gets an items given the item Id*/
	public TimeOffBO getTimeOffById(Integer id) throws NoResultException;
	
	/** Delete an item */
	public void deleteTimeOffById(Integer id);
	
}
