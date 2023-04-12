package com.adjecti.security.core.config;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.adjecti.security.core.model.User;
import com.adjecti.security.core.repository.UserRepository;

@Service
public class CustomUserDetailService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

		User user = userRepository.findByUserName(userName);
		if (user == null) {
			throw new UsernameNotFoundException("User not found !!");
		}
		return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword_(),
				new ArrayList<>());
	}

}
