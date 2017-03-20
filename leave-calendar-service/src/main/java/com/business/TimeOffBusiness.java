package com.business;

import java.util.List;

import javax.persistence.NoResultException;

import com.domain.business.TimeOffBO;

public interface TimeOffBusiness {

	/**Insert an item*/
	public void addTimeOff(TimeOffBO timeOff);
	
	/**Update an item*/
	public void updateTimeOff(TimeOffBO timeOff);
	
	/**Gets all events from the database*/
	public List<TimeOffBO> getAllTimeOffs(); 
	
	/**Gets an items given the item Id*/
	public TimeOffBO getTimeOffById(int itemId) throws NoResultException;
	
}
