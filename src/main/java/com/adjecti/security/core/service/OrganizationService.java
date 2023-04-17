package com.adjecti.security.core.service;

import java.util.List;

import com.adjecti.security.core.model.Organization;

public interface OrganizationService {

	
	public Organization createOrganization(Organization organization);

	public List<Organization> getAllOrganizations();

	public Organization getOrganizationById(long id);

	public Organization updateOrganization(Organization organization, long id);

	public void deleteOrganization(long id);

}
