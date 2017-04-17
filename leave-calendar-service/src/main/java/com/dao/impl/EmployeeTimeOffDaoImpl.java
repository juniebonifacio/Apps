package com.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;

import com.dao.EmployeeTimeOffDao;
import com.domain.hibernate.EmployeeTimeOffVO;

public class EmployeeTimeOffDaoImpl implements EmployeeTimeOffDao {
	
	Logger log = Logger.getLogger(EmployeeTimeOffDaoImpl.class);
	
	@PersistenceContext
	private EntityManager entityManager;
	
    /** Generic Constructor*/
	public EmployeeTimeOffDaoImpl() {}
	
	public EmployeeTimeOffDaoImpl(EntityManagerFactory entityManagerFactory) {
		entityManager = entityManagerFactory.createEntityManager();
	}
	
	@Override
	public void addEmployeeTimeOff(EmployeeTimeOffVO event) {
		entityManager.persist(event);
	}

	@Override
	public void updateEmployeeTimeOff(EmployeeTimeOffVO event) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<EmployeeTimeOffVO> getAllEmployeeTimeOffs() {
		List<EmployeeTimeOffVO> list = entityManager.createQuery("FROM EmployeeTimeOffVO").getResultList();
		log.info("list: " + list);
		return list;
	}

	@Override
	public List<EmployeeTimeOffVO> getEmployeeTimeOffsByUserId(int userId) throws NoResultException {
		// TODO Auto-generated method stub
		return null;
	}

}
