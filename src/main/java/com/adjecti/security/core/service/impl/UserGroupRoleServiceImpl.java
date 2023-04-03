package com.adjecti.security.core.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.adjecti.security.core.exception.ResourceNotFoundException;
import com.adjecti.security.core.model.UserGroupRole;
import com.adjecti.security.core.repository.UserGroupRoleRepository;
import com.adjecti.security.core.service.UserGroupRoleService;

@Service
public class UserGroupRoleServiceImpl implements UserGroupRoleService {

	private UserGroupRoleRepository userGroupRoleRepository;
	
	public UserGroupRoleServiceImpl(UserGroupRoleRepository userGroupRoleRepository) {
		super();
		this.userGroupRoleRepository = userGroupRoleRepository;
	}

	
	@Override
	public UserGroupRole createUserGroupRole(UserGroupRole userGroupRole) {
		System.out.println("UserGroupRole created ..");
		return userGroupRoleRepository.save(userGroupRole);
	}

	@Override
	public List<UserGroupRole> getAllUserGroupRoles() {
		return userGroupRoleRepository.findAll();
	}

	@Override
	public UserGroupRole getUserGroupRoleById(long userGroupRoleId) {
		return userGroupRoleRepository.findById(userGroupRoleId).orElseThrow(() -> new ResourceNotFoundException("UserGroupRole", "Id", userGroupRoleId));

	}

	@Override
	public UserGroupRole updateUserGroupRole(UserGroupRole userGroupRole, long userGroupRoleId) {
	
		UserGroupRole existingUserGroupRole = userGroupRoleRepository.findById(userGroupRoleId)
				.orElseThrow(() -> new ResourceNotFoundException("UserGroupRole", "Id", userGroupRoleId));
	
		existingUserGroupRole.setMvccVersion(userGroupRole.getMvccVersion());
		existingUserGroupRole.setCtCollectionId(userGroupRole.getCtCollectionId());
		existingUserGroupRole.setCompanyId(userGroupRole.getCompanyId());
		existingUserGroupRole.setGroupId(userGroupRole.getGroupId());
		existingUserGroupRole.setRoleId(userGroupRole.getRoleId());
		existingUserGroupRole.setUserId(userGroupRole.getUserId());
		return userGroupRoleRepository.save(existingUserGroupRole);
	}

	@Override
	public void deleteUserGroupRole(long userGroupRoleId) {
		// check whether a UserGroupRole exist or not
		userGroupRoleRepository.findById(userGroupRoleId).orElseThrow(() -> new ResourceNotFoundException("UserGroupRole", "Id", userGroupRoleId));
		userGroupRoleRepository.deleteById(userGroupRoleId);
		
	}

}
