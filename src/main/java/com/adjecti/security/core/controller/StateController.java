package com.adjecti.security.core.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adjecti.security.core.model.State;
import com.adjecti.security.core.service.StateService;

@RestController
@RequestMapping("/api/v1/state")
public class StateController {

	private StateService stateService;

	public StateController(StateService stateService) {
		super();
		this.stateService = stateService;
	} 

	// get all state list 

	@GetMapping("/{countryId}")
	public List<State> getAllStateListByCountryId(@PathVariable Long countryId) {
		return stateService.getStateListByCountryId(countryId);
	}
  
	// get  states by country id
	
	
	
	
	
	
}
