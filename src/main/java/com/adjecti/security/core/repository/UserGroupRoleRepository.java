package com.adjecti.security.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adjecti.security.core.model.UserGroupRole;

public interface UserGroupRoleRepository extends JpaRepository<UserGroupRole, Long> {

}
