package com.adjecti.security.core.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.adjecti.security.core.exception.ResourceNotFoundException;
import com.adjecti.security.core.model.Country;
import com.adjecti.security.core.repository.CountryRepository;
import com.adjecti.security.core.service.CountryService;

@Service
public class CountryServiceImpl implements CountryService {

	
	private CountryRepository countryRepository;

	public CountryServiceImpl(CountryRepository countryRepository) {
		super();
		this.countryRepository = countryRepository;
	}
	
	@Override
	public List<Country> getAllCountryList() {
		return countryRepository.findAll();
	}

	@Override
	public Country getCountryById(long countryId) {
		return countryRepository.findById(countryId).orElseThrow(() -> new ResourceNotFoundException("UserGroup", "Id", countryId));
	}

}
