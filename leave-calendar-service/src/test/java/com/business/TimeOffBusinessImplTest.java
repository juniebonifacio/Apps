package com.business;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:business/business-config.xml"})
public class TimeOffBusinessImplTest {

	private TimeOffBusiness timeOffBusinessFacade;
	private static Log log = LogFactory.getLog(TimeOffBusiness.class);
	
	@Test
	public void test() {
		log.info(timeOffBusinessFacade.getAllTimeOffs());
	}

	/**
	 * @param timeOffBusinessFacade the timeOffBusinessFacade to set
	 */
	@Autowired
	public void setTimeOffBusinessFacade(TimeOffBusiness timeOffBusinessFacade) {
		this.timeOffBusinessFacade = timeOffBusinessFacade;
	}

}
