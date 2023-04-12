package com.adjecti.security.core.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.adjecti.security.core.model.BloodGroup;
import com.adjecti.security.core.repository.BloodGroupRepository;
import com.adjecti.security.core.service.BloodGroupService;

@Service
public class BloodGroupServiceImpl implements BloodGroupService {

	private BloodGroupRepository bloodGroupRepository;

	public BloodGroupServiceImpl(BloodGroupRepository bloodGroupRepository) {
		super();
		this.bloodGroupRepository = bloodGroupRepository;
	}
	@Override
	public List<BloodGroup> getAllBloodGroup() {
		return bloodGroupRepository.findAll();
	}
	@Override
	public BloodGroup createBloodGroup(BloodGroup bloodGroup) {
		return bloodGroupRepository.save(bloodGroup);
	}

	
	
	
}
