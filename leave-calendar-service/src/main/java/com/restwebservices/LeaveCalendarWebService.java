package com.restwebservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.business.TimeOffBusiness;
import com.domain.business.TimeOffBO;

@RestController
public class LeaveCalendarWebService {

	private TimeOffBusiness timeOffBusinessFacade;
	
	//Default Constructor
	public LeaveCalendarWebService() {}
	
	public LeaveCalendarWebService(TimeOffBusiness timeOffBusinessFacade) {
		this.timeOffBusinessFacade = timeOffBusinessFacade;
	}
	
	@ResponseBody
	@RequestMapping(value="/services/getAllTimeOffs", method=RequestMethod.GET, headers="Accept=application/json")
	public List<TimeOffBO> getAllTimeOffs() {
		return timeOffBusinessFacade.getAllTimeOffs();
	}
	
	/**
	 * @param timeOffBusinessFacade the timeOffBusinessFacade to set
	 */
	@Autowired
	public void setTimeOffBusinessFacade(TimeOffBusiness timeOffBusinessFacade) {
		this.timeOffBusinessFacade = timeOffBusinessFacade;
	}
	
	
	
}
