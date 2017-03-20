package com.restwebservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.business.EmployeeTimeOffBusiness;
import com.business.TimeOffBusiness;
import com.domain.business.EmployeeTimeOffBO;
import com.domain.business.TimeOffBO;

@RestController
public class LeaveCalendarWebService {

	private TimeOffBusiness timeOffBusinessFacade;
	private EmployeeTimeOffBusiness employeeTimeOffBusinessFacade;
	
	//Default Constructor
	public LeaveCalendarWebService() {}
	
	public LeaveCalendarWebService(TimeOffBusiness timeOffBusinessFacade) {
		this.timeOffBusinessFacade = timeOffBusinessFacade;
	}
	
	@ResponseBody
	@RequestMapping(value="/services/getAllKindsOfTimeOffs", method=RequestMethod.GET, headers="Accept=application/json")
	public List<TimeOffBO> getAllKindsOfTimeOffs() {
		return timeOffBusinessFacade.getAllTimeOffs();
	}
	
	@ResponseBody
	@RequestMapping(value="/services/getAllEmployeeTimeOffs", method=RequestMethod.GET, headers="Accept=application/json")
	public List<EmployeeTimeOffBO> getAllEmployeeTimeOffs() {
		return employeeTimeOffBusinessFacade.getAllEmployeeTimeOffs();
	}
	
	/**
	 * @param timeOffBusinessFacade the timeOffBusinessFacade to set
	 */
	@Autowired
	public void setTimeOffBusinessFacade(TimeOffBusiness timeOffBusinessFacade) {
		this.timeOffBusinessFacade = timeOffBusinessFacade;
	}

	/**
	 * @param employeeTimeOffBusinessFacade the employeeTimeOffBusinessFacade to set
	 */
	@Autowired
	public void setEmployeeTimeOffBusinessFacade(EmployeeTimeOffBusiness employeeTimeOffBusinessFacade) {
		this.employeeTimeOffBusinessFacade = employeeTimeOffBusinessFacade;
	}
	
	
	
}
