package com.adjecti.security.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adjecti.security.core.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
