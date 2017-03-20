package com.dao;

import java.util.List;

import javax.persistence.NoResultException;

import com.domain.hibernate.TimeOffVO;

public interface TimeOffDao {
	/**Insert an item*/
	public void addTimeOff(TimeOffVO event);
	
	/**Update an item*/
	public void updateTimeOff(TimeOffVO event);
	
	/**Gets all events from the database*/
	public List<TimeOffVO> getAllTimeOffs(); 
	
	/**Gets an items given the item Id*/
	public TimeOffVO getTimeOffById(int itemId) throws NoResultException;
	
}
