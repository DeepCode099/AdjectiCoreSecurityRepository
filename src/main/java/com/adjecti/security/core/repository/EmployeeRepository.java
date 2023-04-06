package com.adjecti.security.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adjecti.security.core.model.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, Long>{

}
