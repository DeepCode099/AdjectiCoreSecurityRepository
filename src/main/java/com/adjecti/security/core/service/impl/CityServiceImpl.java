package com.adjecti.security.core.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.adjecti.security.core.model.City;
import com.adjecti.security.core.repository.CityRepository;
import com.adjecti.security.core.repository.CountryRepository;
import com.adjecti.security.core.service.CityService;

@Service
public class CityServiceImpl implements CityService {
	
	private CityRepository cityRepository;

	public CityServiceImpl(CityRepository cityRepository) {
		super();
		this.cityRepository = cityRepository;
	}	
	@Override
	public List<City> getCityListByStateId(long stateId) {
		return cityRepository.getCityListByStateId(stateId);
	}

}
