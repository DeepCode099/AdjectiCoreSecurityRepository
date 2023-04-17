package com.adjecti.security.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adjecti.security.core.service.RoleService;
import com.adjecti.security.core.service.UserService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {
	
	
	/**/
	//@PostMapping()
/*	public ResponseEntity<?> createAdmin(@RequestBody UserDTO userDto){
		 // add check for username exists in a DB
       if(userService.existsByUserName(userDto.getUserName())){
           return new ResponseEntity<>("Username is already taken!", HttpStatus.BAD_REQUEST);
       }
       // create user object
       User user = new User();
       user.setFirstName(userDto.getFirstName());
       user.setMiddleName(userDto.getMiddleName());
       user.setLastName(userDto.getLastName());
       user.setUserName(userDto.getUserName());
       user.setEmailAddress(userDto.getEmailAddress());
       user.setPassword_(passwordEncoder.encode(userDto.getPassword_()));
       Role	role = roleService.findByName("ROLE_ADMIN").get();
       user.setUserRole(Collections.singleton(role));
       userService.createUser(user);
       return new ResponseEntity<>("Admin Created successfully", HttpStatus.OK);

	
       
	}
*/}
