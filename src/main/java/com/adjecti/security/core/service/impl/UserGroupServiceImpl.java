package com.adjecti.security.core.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.adjecti.security.core.exception.ResourceNotFoundException;
import com.adjecti.security.core.model.UserGroup;
import com.adjecti.security.core.repository.UserGroupRepository;
import com.adjecti.security.core.service.UserGroupService;

@Service
public class UserGroupServiceImpl implements UserGroupService {

	private UserGroupRepository userGroupRepository;
	public UserGroupServiceImpl(UserGroupRepository userGroupRepository) {
		super();
		this.userGroupRepository = userGroupRepository;
	}
	@Override
	public UserGroup createUserGroup(UserGroup userGroup) {
		return userGroupRepository.save(userGroup);
	}

	@Override
	public List<UserGroup> getAllUserGroups() {
		return userGroupRepository.findAll();
	}

	@Override
	public UserGroup getUserGroupById(long id) {
		return userGroupRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("UserGroup", "Id", id));
	}
	
	@Override
	public UserGroup updateUserGroup(UserGroup userGroup, long id) {
		UserGroup existingUserGroup = userGroupRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("UserGroup", "Id", id));
		existingUserGroup.setExternalReferenceCode(userGroup.getExternalReferenceCode());
		existingUserGroup.setUserId(userGroup.getUserId());
		existingUserGroup.setCompanyId(userGroup.getCompanyId());
		existingUserGroup.setUserName(userGroup.getUserName());
		existingUserGroup.setCreateDate(userGroup.getCreateDate());
		existingUserGroup.setModifiedDate(userGroup.getModifiedDate());
		existingUserGroup.setParentUserGroupId(userGroup.getParentUserGroupId());
		existingUserGroup.setName(userGroup.getName());
		existingUserGroup.setDescription(userGroup.getDescription());
		existingUserGroup.setAddedByLdapImport(userGroup.isAddedByLdapImport());
		return userGroupRepository.save(existingUserGroup);
	}
	@Override
	public void deleteUserGroup(long id) {
		// check whether a UserGroup exist or not
		userGroupRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("UserGroup", "Id", id));
		userGroupRepository.deleteById(id);
	}

}
