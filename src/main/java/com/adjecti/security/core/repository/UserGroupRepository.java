package com.adjecti.security.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adjecti.security.core.model.UserGroup;

public interface UserGroupRepository extends JpaRepository<UserGroup, Long> {

}
