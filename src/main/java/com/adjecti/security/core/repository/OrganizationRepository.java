package com.adjecti.security.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adjecti.security.core.model.Organization;

public interface OrganizationRepository  extends JpaRepository<Organization, Long>{

}
