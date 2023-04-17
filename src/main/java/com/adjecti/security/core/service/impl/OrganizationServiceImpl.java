package com.adjecti.security.core.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.adjecti.security.core.exception.ResourceNotFoundException;
import com.adjecti.security.core.model.Organization;
import com.adjecti.security.core.repository.OrganizationRepository;
import com.adjecti.security.core.service.OrganizationService;

@Service
public class OrganizationServiceImpl implements OrganizationService {

    private OrganizationRepository organizationRepository;
	
	public OrganizationServiceImpl(OrganizationRepository organizationRepository) {
		super();
		this.organizationRepository = organizationRepository;
	}
	@Override
	public Organization createOrganization(Organization organization) {
		return organizationRepository.save(organization);	}

	@Override
	public List<Organization> getAllOrganizations() {
		return organizationRepository.findAll();
	}
	
	
	@Override
	public Organization getOrganizationById(long id) {
		return organizationRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Organization", "Id", id));
	}

	@Override
	public Organization updateOrganization(Organization organization, long id) {
		Organization existingOrganization = organizationRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Organization", "Id", id));
		existingOrganization.setCompanyId(organization.getCompanyId());
		existingOrganization.setUserId(organization.getUserId());
		existingOrganization.setUserName(organization.getUserName());
		existingOrganization.setCreateDate(organization.getCreateDate());
		existingOrganization.setModifieDate(organization.getModifieDate());
		existingOrganization.setParentOrganizationId(organization.getParentOrganizationId());
		existingOrganization.setTreePath(organization.getTreePath());
		existingOrganization.setType(organization.getType());
		existingOrganization.setRegionId(organization.getRegionId());
		existingOrganization.setCountryId(organization.getCountryId());
		existingOrganization.setStatusId(organization.getStatusId());
		existingOrganization.setComments(organization.getComments());
		existingOrganization.setLogoId(organization.getLogoId());
		return organizationRepository.save(existingOrganization);
	}

	@Override
	public void deleteOrganization(long id) {
		// check whether a Organization exist or not
		organizationRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Organization", "Id", id));
		organizationRepository.deleteById(id);
		
	}

}
