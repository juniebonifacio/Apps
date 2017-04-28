package com.restwebservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.business.TimeOffBusiness;
import com.domain.business.TimeOffBO;

@RestController
@RequestMapping("/timeoffservice/timeoff/*")
public class TimeOffService {

	private TimeOffBusiness timeOffBusinessFacade;
	
	//Default Constructor
	public TimeOffService() {}
	
	public TimeOffService(TimeOffBusiness timeOffBusinessFacade) {
		this.timeOffBusinessFacade = timeOffBusinessFacade;
	}
	
	@RequestMapping(method=RequestMethod.GET, headers="Accept=application/json")
	public List<TimeOffBO> getAllTimeOffs() {
		return timeOffBusinessFacade.getAllTimeOffs();
	}
	
	@RequestMapping(value = "/{timeOffId}", method=RequestMethod.GET, headers="Accept=application/json")
	public TimeOffBO getTimeOffByIdWithRequestParam(@PathVariable Integer timeOffId) {
		System.out.println("timeOffId: " + timeOffId);
		TimeOffBO timeOffBO = timeOffBusinessFacade.getTimeOffById(timeOffId);
		return timeOffBO;
	}
	
	@RequestMapping("/add")
	public String addTimeOff() {
		// TODO Auto-generated method stub
		return null;
	}

	@RequestMapping("/update")
	public String updateTimeOff() {
		// TODO Auto-generated method stub
		return null;
	}

	@RequestMapping(value={"/remove", "/delete"})
	public String deleteTimeOffById(@RequestParam("id") Integer id) {
		timeOffBusinessFacade.deleteTimeOffById(id);
		
		return null;
	}
	
	/**
	 * @param timeOffBusinessFacade the timeOffBusinessFacade to set
	 */
	@Autowired
	public void setTimeOffBusinessFacade(TimeOffBusiness timeOffBusinessFacade) {
		this.timeOffBusinessFacade = timeOffBusinessFacade;
	}

}
