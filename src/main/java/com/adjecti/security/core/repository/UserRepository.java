package com.adjecti.security.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adjecti.security.core.model.User;

public interface UserRepository extends JpaRepository<User, Long>  {

}
