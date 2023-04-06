package com.adjecti.security.core.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adjecti.security.core.model.UserGroupRole;
import com.adjecti.security.core.service.UserGroupRoleService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/userGroupRole")
public class UserGroupRoleController {
	
	private UserGroupRoleService userGroupRoleService;

	public UserGroupRoleController(UserGroupRoleService userGroupRoleService) {
		super();
		this.userGroupRoleService = userGroupRoleService;
	}
	// build create userGroupRole REST API
	@PostMapping()
	public ResponseEntity<UserGroupRole> createUserGroupRole(@RequestBody UserGroupRole userGroupRole){
		return new ResponseEntity<UserGroupRole>(userGroupRoleService.createUserGroupRole(userGroupRole), HttpStatus.CREATED);
	}
	
	// build get all userGroupRole REST API
	@GetMapping
	public List<UserGroupRole> getAllUserGroupRoles(){
		return userGroupRoleService.getAllUserGroupRoles();
	}
	
	// build get userGroupRole by id REST API
	// http://localhost:8080/api/v1/userGroupRole/1
	@GetMapping("{id}")
	public ResponseEntity<UserGroupRole> getUserGroupRoleById(@PathVariable("id") long userGroupRoleId){
		return new ResponseEntity<UserGroupRole>(userGroupRoleService.getUserGroupRoleById(userGroupRoleId), HttpStatus.OK);
	}
	
	// build update userGroup REST API
	// http://localhost:8080/api/v1/userGroupRole/1
	@PutMapping("{id}")
	public ResponseEntity<UserGroupRole> updateUserGroupRole(@PathVariable("id") long id ,@RequestBody UserGroupRole userGroupRole){
		return new ResponseEntity<UserGroupRole>(userGroupRoleService.updateUserGroupRole(userGroupRole, id), HttpStatus.OK);
	}
	// build delete userGroups REST API
	// http://localhost:8080/api/v1/userGroupRole/1
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteUserGroupRole(@PathVariable("id") long id){
		// delete userGroupRole from DB
		userGroupRoleService.deleteUserGroupRole(id);
		return new ResponseEntity<String>("UserGroupRole deleted successfully!.", HttpStatus.OK);
	}


}
