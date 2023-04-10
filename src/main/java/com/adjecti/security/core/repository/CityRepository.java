package com.adjecti.security.core.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.adjecti.security.core.model.City;

public interface CityRepository extends JpaRepository<City,Long> {

	@Query(value = "select * from city where stateid = ?", nativeQuery = true)
	public List<City> getCityListByStateId(long stateId);
}
