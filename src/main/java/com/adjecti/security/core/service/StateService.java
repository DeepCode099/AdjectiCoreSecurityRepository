package com.adjecti.security.core.service;

import java.util.List;

import com.adjecti.security.core.model.State;

public interface StateService {
	
	public List<State> getStateListByCountryId(Long countryId);
}
