package com.adjecti.security.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adjecti.security.core.model.Group;

public interface GroupRepository extends JpaRepository<Group, Long> {

}
