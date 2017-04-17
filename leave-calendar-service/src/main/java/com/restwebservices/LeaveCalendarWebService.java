package com.restwebservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
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
	

	@RequestMapping(value="/services/getAllTypesOfTimeOff", method=RequestMethod.GET, headers="Accept=application/json")
	public @ResponseBody List<TimeOffBO> getAllTypesOfTimeOff() {
		return timeOffBusinessFacade.getAllTimeOffs();
	}
	
	@RequestMapping(value="/services/getAllEmployeeTimeOffs", method=RequestMethod.GET, headers="Accept=application/json")
	public	@ResponseBody List<EmployeeTimeOffBO> getAllEmployeeTimeOffs() {
		return employeeTimeOffBusinessFacade.getAllEmployeeTimeOffs();
	}
	
	@RequestMapping(value="/services/addEmployeeTimeOff", method=RequestMethod.POST)
	public @ResponseBody String addEmployeeTimeOff(@RequestBody EmployeeTimeOffBO employeeTimeOffBO) {
		String result = "0";
		System.out.println("addEmployeeTimeOff: ownerId: " + employeeTimeOffBO.getOwnerId() + "; timeOffId: " + employeeTimeOffBO.getTimeOffId() + 
				"; description: " + employeeTimeOffBO.getDescription());
		try {
			employeeTimeOffBusinessFacade.addEmployeeTimeOff(employeeTimeOffBO);
		} catch (Exception e) {
			result = "1";
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		return result;
		
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
