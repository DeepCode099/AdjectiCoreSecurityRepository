package com.adjecti.security.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adjecti.security.core.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
