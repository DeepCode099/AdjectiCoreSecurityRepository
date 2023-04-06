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

import com.adjecti.security.core.model.UsersOrganization;
import com.adjecti.security.core.service.UsersOrganizationService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/UsersOrganization")
public class UsersOrganizationsController {
	
	private UsersOrganizationService usersOrganizationService;

	public UsersOrganizationsController(UsersOrganizationService usersOrganizationService) {
		super();
		this.usersOrganizationService = usersOrganizationService;
	}
	// build create userGroupRole REST API
	@PostMapping()
	public ResponseEntity<UsersOrganization> createUsersOrganization(@RequestBody UsersOrganization usersOrganization){
		return new ResponseEntity<UsersOrganization>(usersOrganizationService.createUsersOrganization(usersOrganization), HttpStatus.CREATED);
	}
	
	// build get all userGroupRole REST API
	@GetMapping
	public List<UsersOrganization> getAllUsersOrganizations(){
		return usersOrganizationService.getAllUsersOrganization();
	}
	
	// build get userGroupRole by id REST API
	// http://localhost:8080/api/v1/userGroupRole/1
	@GetMapping("{id}")
	public ResponseEntity<UsersOrganization> getUsersOrganizationById(@PathVariable("id") long getUsersOrganizationById){
		return new ResponseEntity<UsersOrganization>(usersOrganizationService.getUsersOrganizationById(getUsersOrganizationById), HttpStatus.OK);
	}
	
	// build update userGroup REST API
	// http://localhost:8080/api/v1/userGroupRole/1
	@PutMapping("{id}")
	public ResponseEntity<UsersOrganization> updateUsersOrganization(@PathVariable("id") long id ,@RequestBody UsersOrganization usersOrganization){
		return new ResponseEntity<UsersOrganization>(usersOrganizationService.updateUsersOrganization(usersOrganization, id), HttpStatus.OK);
	}
	// build delete userGroups REST API
	// http://localhost:8080/api/v1/userGroupRole/1
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteUsersOrganizations(@PathVariable("id") long id){
		// delete userGroupRole from DB
		usersOrganizationService.deleteUsersOrganization(id);
		return new ResponseEntity<String>("UsersOrganization deleted successfully!.", HttpStatus.OK);
	}

}
