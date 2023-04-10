package com.adjecti.security.core.service;

import java.util.List;

import com.adjecti.security.core.model.City;

public interface CityService {
	
	public List<City> getCityListByStateId(long stateId);

}
