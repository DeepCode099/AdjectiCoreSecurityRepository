package com.adjecti.security.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adjecti.security.core.model.Designation;


public interface DesignationRepository extends  JpaRepository<Designation, Long> {

}
