package com.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import com.dao.TimeOffDao;
import com.domain.hibernate.TimeOffVO;

public class TimeOffDaoImpl implements TimeOffDao {
	@PersistenceContext
	private EntityManager entityManager;
	
    /** Generic Constructor*/
	public TimeOffDaoImpl() {}

	public TimeOffDaoImpl(EntityManagerFactory entityManagerFactory){
		entityManager = entityManagerFactory.createEntityManager();
	}
	
	@Override
	public void addTimeOff(TimeOffVO event) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateTimeOff(TimeOffVO event) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<TimeOffVO> getAllTimeOffs() {
		return entityManager.createQuery("FROM TimeOffVO").getResultList();
	}

	@Override
	public TimeOffVO getTimeOffById(int itemId) throws NoResultException {
		// TODO Auto-generated method stub
		return null;
	}

}
