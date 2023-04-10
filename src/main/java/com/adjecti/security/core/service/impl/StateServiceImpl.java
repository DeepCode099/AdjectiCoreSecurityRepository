package com.adjecti.security.core.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.adjecti.security.core.model.State;
import com.adjecti.security.core.repository.StateRepository;
import com.adjecti.security.core.service.StateService;


@Service
public class StateServiceImpl implements StateService  {
    
	private StateRepository stateRepository;

	public StateServiceImpl(StateRepository stateRepository) {
		super();
		this.stateRepository = stateRepository;
	}

	@Override
	public List<State> getStateListByCountryId(long countryId) {
		return stateRepository.getStateListByCountryId(countryId);
	}

	
	

}
