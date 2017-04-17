package com.business.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.NoResultException;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.business.BusinessType;
import com.business.EmployeeTimeOffBusiness;
import com.dao.EmployeeTimeOffDao;
import com.domain.business.EmployeeTimeOffBO;
import com.domain.hibernate.EmployeeTimeOffVO;

public class EmployeeTimeOffBusinessImpl extends BusinessType implements EmployeeTimeOffBusiness {

	private EmployeeTimeOffDao employeeTimeOffDao;
	Logger log = Logger.getLogger(EmployeeTimeOffBusinessImpl.class);
	
	@Override
	@Transactional
	public void addEmployeeTimeOff(EmployeeTimeOffBO employeeTimeOffBO) {
		EmployeeTimeOffVO employeeTimeOffVO = new EmployeeTimeOffVO();
		employeeTimeOffVO.setOwnerId(employeeTimeOffBO.getOwnerId());
		employeeTimeOffVO.setTimeOffId(employeeTimeOffBO.getTimeOffId());
		employeeTimeOffVO.setDescription(employeeTimeOffBO.getDescription());
		employeeTimeOffDao.addEmployeeTimeOff(employeeTimeOffVO);
	}

	@Override
	@Transactional
	public void updateEmployeeTimeOff(EmployeeTimeOffBO timeOff) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public List<EmployeeTimeOffBO> getAllEmployeeTimeOffs() {
		List<EmployeeTimeOffBO>  employeeTimeOffs = new ArrayList<EmployeeTimeOffBO>();
		
		List<EmployeeTimeOffVO> list =  employeeTimeOffDao.getAllEmployeeTimeOffs();
		log.info("employeeTimeOffs list: " + list);
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			EmployeeTimeOffVO employeeTimeOffVO = (EmployeeTimeOffVO) iterator.next();
			log.info("id: " + employeeTimeOffVO.getId() 
			+ "; ownerId:  "+ employeeTimeOffVO.getOwnerId() 
			+ "; description: " + employeeTimeOffVO.getDescription() 
			+ "; timeOffId: " + employeeTimeOffVO.getTimeOffId()
			+ "; timeOff: " + employeeTimeOffVO.getTimeOff().getName());
			
			EmployeeTimeOffBO employeeTimeOffBO = new EmployeeTimeOffBO();
			employeeTimeOffBO.setId(employeeTimeOffVO.getId());
			employeeTimeOffBO.setOwnerId(employeeTimeOffVO.getOwnerId());
			employeeTimeOffBO.setTimeOff(employeeTimeOffVO.getTimeOff());
			employeeTimeOffBO.setDescription(employeeTimeOffVO.getDescription());
			employeeTimeOffs.add(employeeTimeOffBO);
		}
		
		
		/*		
		for(EmployeeTimeOffVO employeeTimeOffVO : employeeTimeOffDao.getAllEmployeeTimeOffs()) {
			employeeTimeOffs.add(getMapper().map(employeeTimeOffVO, EmployeeTimeOffBO.class));
		}
		
		log.info("employeeTimeOffs: " + employeeTimeOffs);
		*/
		
		return employeeTimeOffs;
	}

	@Override
	@Transactional
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
	