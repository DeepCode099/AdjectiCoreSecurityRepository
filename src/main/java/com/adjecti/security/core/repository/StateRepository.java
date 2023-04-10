
package com.adjecti.security.core.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adjecti.security.core.model.State;

public interface StateRepository extends JpaRepository<State, Long> {
	
	public List<State> findByCountryId(Long countryId);
}
