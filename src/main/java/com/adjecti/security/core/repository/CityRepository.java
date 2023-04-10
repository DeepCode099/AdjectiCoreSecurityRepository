package com.adjecti.security.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adjecti.security.core.model.City;

public interface CityRepository extends JpaRepository<City,Long> {

}
