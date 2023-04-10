
package com.adjecti.security.core.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.adjecti.security.core.model.State;

public interface StateRepository extends JpaRepository<State, Long> {
    
	@Query(value = "select * from state where countryid = ?", nativeQuery = true)
	public List<State> getStateListByCountryId(long countryId);
}
