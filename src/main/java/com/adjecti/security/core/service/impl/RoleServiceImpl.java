package com.adjecti.security.core.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.adjecti.security.core.exception.ResourceNotFoundException;
import com.adjecti.security.core.model.Role;
import com.adjecti.security.core.repository.RoleRepository;
import com.adjecti.security.core.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

	private RoleRepository roleRepository;

	public RoleServiceImpl(RoleRepository roleRepository) {
		super();
		this.roleRepository = roleRepository;
	}

	@Override
	public Role createRole(Role role) {
		System.out.println("Role created ..");
		return roleRepository.save(role);
	}

	@Override
	public List<Role> getAllRoles() {
		return roleRepository.findAll();
	}

	@Override
	public Role getRoleById(long id) {
		return roleRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Role", "Id", id));

	}

	@Override
	public Role updateRole(Role role, long id) {
		Role existingRole = roleRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Role", "Id", id));
		existingRole.setClassNameId(role.getClassNameId());
		existingRole.setClasspk(role.getClasspk());
		existingRole.setCompanyId(role.getCompanyId());
		existingRole.setCreateDate(role.getCreateDate());
		existingRole.setCtCollectionId(role.getCtCollectionId());
		existingRole.setDescription(role.getDescription());
		existingRole.setModifiedDate(role.getModifiedDate());
		existingRole.setMvccVersion(role.getMvccVersion());
		existingRole.setName(role.getName());
		existingRole.setSubType(role.getSubType());
		existingRole.setTitle(role.getTitle());
		existingRole.setType(role.getType());
		existingRole.setUserName(role.getUserName());
		existingRole.setUuid_(role.getUuid_());
		existingRole.setUserId(role.getUserId());
		return roleRepository.save(existingRole);
	}

	@Override
	public void deleteRole(long id) {
		// check whether a Role exist or not
		roleRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Role", "Id", id));
		// TODO Auto-generated method stub
		roleRepository.deleteById(id);

	}

}
