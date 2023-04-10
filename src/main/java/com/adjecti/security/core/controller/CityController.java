package com.adjecti.security.core.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adjecti.security.core.model.City;
import com.adjecti.security.core.service.CityService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/city")
public class CityController {

	
	private CityService cityService;

	public CityController(CityService cityService) {
		super();
		this.cityService = cityService;
	}

	@GetMapping("/{stateId}")
	public List<City> getAllCityListByStateId(@PathVariable Long stateId){
		return cityService.getCityListByStateId(stateId);
	}

}
