package com.adjecti.security.core.config;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailService implements UserDetailsService {
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		if (userName.equals("Himanshu")) {
			return new User("Himanshu", "Himanshu123", new ArrayList<>());
		} else {
			throw new UsernameNotFoundException("User not found !!");
		}
 	}
}
