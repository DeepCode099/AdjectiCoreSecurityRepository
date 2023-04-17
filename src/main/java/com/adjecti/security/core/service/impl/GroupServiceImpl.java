package com.adjecti.security.core.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.adjecti.security.core.exception.ResourceNotFoundException;
import com.adjecti.security.core.model.Group;
import com.adjecti.security.core.repository.GroupRepository;
import com.adjecti.security.core.service.GroupService;

@Service
public class GroupServiceImpl implements GroupService  {

	private GroupRepository groupRepositroy;
	
	public GroupServiceImpl(GroupRepository groupRepository) {
	
		super();
		this.groupRepositroy = groupRepository;
	}
	
	
	@Override
	public Group createGroup(Group group) {
		return groupRepositroy.save(group);
	}

	@Override
	public List<Group> getAllGroups() {
		return groupRepositroy.findAll();
	}

	@Override
	public Group getGroupById(long id) {
		return groupRepositroy.findById(id).orElseThrow(() -> new ResourceNotFoundException("Group", "Id", id));
	}

	@Override
	public Group updateGroup(Group group, long id) {
		Group existingGroup = groupRepositroy.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Group", "Id", id));
		existingGroup.setCompanyId(group.getCompanyId());
		existingGroup.setCreatorUserId(group.getCreatorUserId());
		existingGroup.setModifiedDate(group.getModifiedDate());
		existingGroup.setClassNameId(group.getClassNameId());
		existingGroup.setClassPk(group.getClassPk());
		existingGroup.setParentGroupId(group.getParentGroupId());
		existingGroup.setLivegroupId(group.getLivegroupId());
		existingGroup.setTreePath(group.getTreePath());
		existingGroup.setGroupKey(group.getGroupKey());
		existingGroup.setName(group.getName());
		existingGroup.setDescription(group.getDescription());
		existingGroup.setType(group.getType());
		existingGroup.setTypeSettings(group.getTypeSettings());
		existingGroup.setManualMembership(group.isManualMembership());
		existingGroup.setMemebershipPrestriction(group.getMemebershipPrestriction());
		existingGroup.setFriendlyUrl(group.getFriendlyUrl());
		existingGroup.setSite(group.isSite());
		existingGroup.setInheritContent(group.isInheritContent());
		existingGroup.setActive(group.isActive());
		return groupRepositroy.save(existingGroup);
	}

	@Override
	public void deleteGroup(long id) {
		// check whether a Group exist or not
		groupRepositroy.findById(id).orElseThrow(() -> new ResourceNotFoundException("Group", "Id", id));
		// TODO Auto-generated method stub
		groupRepositroy.deleteById(id);

	}

}
