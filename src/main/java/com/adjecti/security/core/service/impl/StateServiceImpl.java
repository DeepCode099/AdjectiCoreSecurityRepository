package com.adjecti.security.core.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.adjecti.security.core.exception.ResourceNotFoundException;
import com.adjecti.security.core.model.State;
import com.adjecti.security.core.repository.RoleRepository;
import com.adjecti.security.core.repository.StateRepository;
import com.adjecti.security.core.service.StateService;


@Service
public class StateServiceImpl implements StateService {

	private StateRepository stateRepository;

	public StateServiceImpl(StateRepository stateRepository) {
		super();
		this.stateRepository = stateRepository;
	}

	@Override
	public List<State> getAllStates() {
		return stateRepository.findAll();
	}

	@Override
	public Optional<State> getAllStatesByCountryId(long countryId) {
	//	stateRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Role", "Id", id));;
	Optional<State> stateList =	stateRepository.findById(countryId);
		return stateList;	
				}

	@Override
	public Optional<State> getAllStatesByStateId(long stateId) {
		Optional<State> stateList =	stateRepository.findById(stateId);
		return stateList;
	}
	
	
	
	

}
