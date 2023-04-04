package com.adjecti.security.core.service;

import java.util.List;
import java.util.Optional;

import com.adjecti.security.core.model.State;

public interface StateService {

	public List<State> getAllStates();
	public Optional<State> getAllStatesByCountryId(long countryId);
	public Optional<State> getAllStatesByStateId(long stateId);
 	
	
}
