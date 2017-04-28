package com.business.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.NoResultException;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.business.BusinessType;
import com.business.TimeOffBusiness;
import com.dao.TimeOffDao;
import com.domain.business.TimeOffBO;
import com.domain.hibernate.TimeOffVO;

public class TimeOffBusinessImpl extends BusinessType implements TimeOffBusiness {
	
	/** TimeOff data access object*/
	private TimeOffDao timeOffDao;
	
	Logger log = Logger.getLogger(TimeOffBusinessImpl.class);

	@Override
	@Transactional
	public void addTimeOffType(TimeOffBO timeOff) {
		// TODO Auto-generated method stub

	}

	@Override
	@Transactional
	public void updateTimeOff(TimeOffBO timeOff) {
		// TODO Auto-generated method stub

	}

	@Override
	@Transactional
	public List<TimeOffBO> getAllTimeOffs() {
		List<TimeOffBO> timeOffs = new ArrayList<TimeOffBO>();
		
		for (TimeOffVO timeOffVO : timeOffDao.getAllTimeOffs()) {
			timeOffs.add(getMapper().map(timeOffVO, TimeOffBO.class));
		}
		
		return timeOffs;
	}

	@Override
	@Transactional
	public TimeOffBO getTimeOffById(Integer id) throws NoResultException {
		
		TimeOffVO timeOffVO = null;
		try{
			timeOffVO = timeOffDao.getTimeOffById(id);
		}catch(NoResultException nre){
			log.warn("No timeOff with id '" + id + "' is present in the database");
			return null;
		}
		
		return getMapper().map(timeOffVO, TimeOffBO.class);
	}
	
	@Override
	public void deleteTimeOffById(Integer id) {
		timeOffDao.deleteTimeOffById(id);
	}

	/**
	 * @param timeOffDao the timeOffDao to set
	 */
	@Autowired
	public void setTimeOffDao(TimeOffDao timeOffDao) {
		this.timeOffDao = timeOffDao;
	}

}
