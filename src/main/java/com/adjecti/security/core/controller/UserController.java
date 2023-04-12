package com.adjecti.security.core.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adjecti.security.core.dto.UserDTO;
import com.adjecti.security.core.model.Role;
import com.adjecti.security.core.model.User;
import com.adjecti.security.core.service.RoleService;
import com.adjecti.security.core.service.UserService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/user")
public class UserController {

	@Autowired
	private UserService userService;
	@Autowired
	private RoleService roleService;
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	// build create user REST API
	@PostMapping("/{register}")
	public ResponseEntity<?> createUser(@RequestBody UserDTO userDto){
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
        user.setPassword_(bCryptPasswordEncoder.encode(userDto.getPassword_()));  
 System.out.println("password -->"+user.getPassword_());
     	Role role = roleService.findByName("ROLE_USER").get();
        user.setUserRole(Collections.singleton(role));
        System.out.println("user object"+user.toString());
        userService.createUser(user);
        return new ResponseEntity<>("User registered successfully", HttpStatus.OK);

		//return new ResponseEntity<User>(userService.createUser(user), HttpStatus.CREATED);
	}
	// build get all user REST API
	@GetMapping
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	// build get user by id REST API
	// http://localhost:8080/api/v1/user/1
	@GetMapping("{id}")
	public ResponseEntity<User> getUserById(@PathVariable("id") long userId){
		return new ResponseEntity<User>(userService.getUserById(userId), HttpStatus.OK);
	}
	// build update users REST API
	// http://localhost:8080/api/v1/user/1
	@PutMapping("{id}")
	public ResponseEntity<User> updateUser(@PathVariable("id") long userId ,@RequestBody User user){
		return new ResponseEntity<User>(userService.updateUser(user, userId), HttpStatus.OK);
	}
	// build delete users REST API
	// http://localhost:8080/api/v1/user/1
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteUser(@PathVariable("id") long userId){
		// delete users from DB
		userService.deleteUser(userId);
		return new ResponseEntity<String>("User deleted successfully!.", HttpStatus.OK);
	}
	
}
