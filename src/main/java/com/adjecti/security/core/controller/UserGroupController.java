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

import com.adjecti.security.core.model.UserGroup;
import com.adjecti.security.core.service.UserGroupService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/userGroup")
public class UserGroupController {

	private UserGroupService userGroupService;

	public UserGroupController(UserGroupService userGroupService) {
		super();
		this.userGroupService = userGroupService;
	}
	// build create userGroup REST API
	@PostMapping()
	public ResponseEntity<UserGroup> createUserGroup(@RequestBody UserGroup userGroup){
		return new ResponseEntity<UserGroup>(userGroupService.createUserGroup(userGroup), HttpStatus.CREATED);
	}
	
	// build get all userGroup REST API
	@GetMapping
	public List<UserGroup> getAllUserGroups(){
		return userGroupService.getAllUserGroups();
	}
	
	// build get userGroup by id REST API
	// http://localhost:8080/api/v1/userGroups/1
	@GetMapping("{id}")
	public ResponseEntity<UserGroup> getUserGroupById(@PathVariable("id") long userGroupId){
		return new ResponseEntity<UserGroup>(userGroupService.getUserGroupById(userGroupId), HttpStatus.OK);
	}
	
	// build update userGroup REST API
	// http://localhost:8080/api/v1/userGroups/1
	@PutMapping("{id}")
	public ResponseEntity<UserGroup> updateUserGroup(@PathVariable("id") long id ,@RequestBody UserGroup userGroup){
		return new ResponseEntity<UserGroup>(userGroupService.updateUserGroup(userGroup, id), HttpStatus.OK);
	}
	// build delete userGroups REST API
	// http://localhost:8080/api/v1/userGroups/1
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteUserGroup(@PathVariable("id") long id){
		// delete userGroup from DB
		userGroupService.deleteUserGroup(id);
		return new ResponseEntity<String>("UserGroup deleted successfully!.", HttpStatus.OK);
	}
	
}
