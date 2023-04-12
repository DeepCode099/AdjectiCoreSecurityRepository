package com.adjecti.security.core.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adjecti.security.core.model.User;

public interface UserRepository extends JpaRepository<User, Long>  {
	
    public User findByUserName(String userName);
    public  Boolean existsByUserName(String userName);
    public Boolean existsByEmailAddress(String emailAddress);

}
