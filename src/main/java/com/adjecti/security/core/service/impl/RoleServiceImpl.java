package com.adjecti.security.core.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.Set;

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
		existingRole.setCompanyId(role.getCompanyId());
		existingRole.setCreateDate(role.getCreateDate());
		existingRole.setDescription(role.getDescription());
		existingRole.setModifiedDate(role.getModifiedDate());
		existingRole.setName(role.getName());
		existingRole.setSubType(role.getSubType());
		existingRole.setTitle(role.getTitle());
		existingRole.setType(role.getType());
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

	@Override
	public Optional<Role> findByName(String name) {
		return  roleRepository.findByName(name);
	}

}
