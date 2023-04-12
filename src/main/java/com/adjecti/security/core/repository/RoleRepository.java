package com.adjecti.security.core.repository;

import java.util.Optional;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.adjecti.security.core.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

	@Query(value = "SELECT * from role_ where userid = ?",nativeQuery = true)
	public Set<Role> getAllRolesByUserId(long userId);

	 Optional<Role> findByName(String name);
	
}

