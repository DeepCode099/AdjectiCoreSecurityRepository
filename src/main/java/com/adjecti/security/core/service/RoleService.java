package com.adjecti.security.core.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import com.adjecti.security.core.model.Role;

public interface RoleService {
	   public Role createRole(Role role);
	   public List<Role> getAllRoles();
	   public Role getRoleById(long id);
	   public Role updateRole(Role role, long id);
	   public void deleteRole(long id);
	   
	   public Optional<Role> findByName(String name);
	
}
