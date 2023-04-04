package com.adjecti.security.core.service;

import java.util.List;

import com.adjecti.security.core.model.Country;

public interface CountryService  {
	
	public List<Country> getAllCountryList();
	public Country getCountryById(long countryId);

}
