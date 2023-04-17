package com.adjecti.security.core.service;

import java.util.List;

import com.adjecti.security.core.model.Group;

public interface GroupService {
	public Group createGroup(Group group);

	public List<Group> getAllGroups();

	public Group getGroupById(long id);

	public Group updateGroup(Group group, long id);

	public void deleteGroup(long id);
}
