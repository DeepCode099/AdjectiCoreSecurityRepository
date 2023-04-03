package com.adjecti.security.core.service;

import java.util.List;

import com.adjecti.security.core.model.UserGroup;

public interface UserGroupService {

	   public UserGroup createUserGroup(UserGroup userGroup);
	   public List<UserGroup> getAllUserGroups();
	   public UserGroup getUserGroupById(long id);
	   public UserGroup updateUserGroup(UserGroup user, long id);
	   public void deleteUserGroup(long id); 
	
	
}
