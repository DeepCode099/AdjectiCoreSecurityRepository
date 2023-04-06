package com.adjecti.security.core.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.adjecti.security.core.exception.ResourceNotFoundException;
import com.adjecti.security.core.model.UsersOrganization;
import com.adjecti.security.core.repository.UsersOrganizationRepository;
import com.adjecti.security.core.service.UsersOrganizationService;

@Service
public class UsersOrganizationsServiceImpl implements UsersOrganizationService {


	private UsersOrganizationRepository usersOrganizationsRepository;

	public UsersOrganizationsServiceImpl(UsersOrganizationRepository usersOrganizationsRepository) {
		super();
		this.usersOrganizationsRepository = usersOrganizationsRepository;
	}
	
	
	@Override
	public UsersOrganization createUsersOrganization(UsersOrganization usersOrganizations) {
		return usersOrganizationsRepository.save(usersOrganizations);
	}

	@Override
	public List<UsersOrganization> getAllUsersOrganization() {
		
		return usersOrganizationsRepository.findAll();
	}

	@Override
	public UsersOrganization getUsersOrganizationById(long UserOrganizationId) {
		return usersOrganizationsRepository.findById(UserOrganizationId).orElseThrow(() -> new ResourceNotFoundException("UserOrganizationId", "Id", UserOrganizationId));

	}

	@Override
	public UsersOrganization updateUsersOrganization(UsersOrganization usersOrganization, long UserOrganizationId) {
		UsersOrganization existingUsersOrganizations = usersOrganizationsRepository.findById(UserOrganizationId)
				.orElseThrow(() -> new ResourceNotFoundException("UserOrganization", "Id", UserOrganizationId));
		existingUsersOrganizations.setCompanyId(usersOrganization.getCompanyId());
		existingUsersOrganizations.setUserId(usersOrganization.getUserId());
		existingUsersOrganizations.setId(usersOrganization.getId());
		return usersOrganizationsRepository.save(existingUsersOrganizations);
	}

	@Override
	public void deleteUsersOrganization(long UserOrganizationId) {
		// check whether a user exist or not
		usersOrganizationsRepository.findById(UserOrganizationId).orElseThrow(() -> new ResourceNotFoundException("UserOrganization", "Id", UserOrganizationId));
		usersOrganizationsRepository.deleteById(UserOrganizationId);
	}

}
