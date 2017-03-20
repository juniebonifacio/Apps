package com.business.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.NoResultException;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.business.BusinessType;
import com.business.EmployeeTimeOffBusiness;
import com.dao.EmployeeTimeOffDao;
import com.domain.business.EmployeeTimeOffBO;
import com.domain.hibernate.EmployeeTimeOffVO;

public class EmployeeTimeOffBusinessImpl extends BusinessType implements EmployeeTimeOffBusiness {

	private EmployeeTimeOffDao employeeTimeOffDao;
	Logger log = Logger.getLogger(EmployeeTimeOffBusinessImpl.class);
	
	@Override
	public void addEmployeeTimeOff(EmployeeTimeOffBO timeOff) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEmployeeTimeOff(EmployeeTimeOffBO timeOff) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<EmployeeTimeOffBO> getAllEmployeeTimeOffs() {
		List<EmployeeTimeOffBO>  employeeTimeOffs = new ArrayList<EmployeeTimeOffBO>();
		
		for(EmployeeTimeOffVO employeeTimeOffVO : employeeTimeOffDao.getAllEmployeeTimeOffs()) {
			employeeTimeOffs.add(getMapper().map(employeeTimeOffVO, EmployeeTimeOffBO.class));
		}
		
		log.info("employeeTimeOffs: " + employeeTimeOffs);
		return employeeTimeOffs;
	}

	@Override
	public List<EmployeeTimeOffBO> getEmployeeTimeOffsByUserId(int userId) throws NoResultException {
		List<EmployeeTimeOffBO>  employeeTimeOffs = new ArrayList<EmployeeTimeOffBO>();
		
		for(EmployeeTimeOffVO employeeTimeOffVO : employeeTimeOffDao.getEmployeeTimeOffsByUserId(userId)) {
			employeeTimeOffs.add(getMapper().map(employeeTimeOffVO, EmployeeTimeOffBO.class));
		}
		log.info("employeeTimeOffs: " + employeeTimeOffs);
		return employeeTimeOffs;
	}

	/**
	 * @param employeeTimeOffDao the employeeTimeOffDao to set
	 */
	@Autowired
	public void setEmployeeTimeOffDao(EmployeeTimeOffDao employeeTimeOffDao) {
		this.employeeTimeOffDao = employeeTimeOffDao;
	}

}
	