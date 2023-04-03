package com.adjecti.security.core.service;

import java.util.List;

import com.adjecti.security.core.model.UserGroupRole;

public interface UserGroupRoleService {

	   public UserGroupRole createUserGroupRole(UserGroupRole userGroupRole);
	   public List<UserGroupRole> getAllUserGroupRoles();
	   public UserGroupRole getUserGroupRoleById(long userGroupRoleId);
	   public UserGroupRole updateUserGroupRole(UserGroupRole userGroupRole, long userGroupRoleId);
	   public void deleteUserGroupRole(long userGroupRoleId); 
	
}
