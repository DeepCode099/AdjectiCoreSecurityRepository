package com.adjecti.security.core.service;

import java.util.List;

import com.adjecti.security.core.model.User;

public interface UserService {
       public User createUser(User user);
	   public List<User> getAllUsers();
	   public User getUserById(long id);
	   public User updateUser(User user, long id);
	   public void deleteUser(long id); 
	   public Boolean existsByUserName(String userName);
	   public User findByUserName(String userName);

}
