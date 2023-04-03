package com.adjecti.security.core.service;

import java.util.List;

import com.adjecti.security.core.model.UsersOrganization;


public interface UsersOrganizationService {

	   public UsersOrganization createUsersOrganization(UsersOrganization usersOrganization);
	   public List<UsersOrganization> getAllUsersOrganization();
	   public UsersOrganization getUsersOrganizationById(long UserOrganizationId);
	   public UsersOrganization updateUsersOrganization(UsersOrganization usersOrganization, long UserOrganizationId);
	   public void deleteUsersOrganization(long UserOrganizationId); 

}
