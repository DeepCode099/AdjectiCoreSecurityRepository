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

import com.adjecti.security.core.model.Role;
import com.adjecti.security.core.service.RoleService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/role")
public class RoleController {
 
	private RoleService roleService;
	
	public RoleController(RoleService roleService) {
		super();
		this.roleService = roleService;
	}
	
	// build create Role REST API
//	http://localhost:8080/api/v2/role
	@PostMapping()
	public ResponseEntity<Role> createRole(@RequestBody Role role){
		return new ResponseEntity<Role>(roleService.createRole(role), HttpStatus.CREATED);
	}
	
	// build get all roles REST API
	// http://localhost:8080/api/v2/roles
	@GetMapping
	public List<Role> getAllRoles(){
		return roleService.getAllRoles();
	}
	
	// build get role by id REST API
	// http://localhost:8080/api/v2/roles/1
	@GetMapping("{id}")
	public ResponseEntity<Role> getRoleById(@PathVariable("id") long roleId){
		return new ResponseEntity<Role>(roleService.getRoleById(roleId), HttpStatus.OK);
	}
	
	// build update role REST API
	// http://localhost:8080/api/roles/v1/1
	@PutMapping("{id}")
	public ResponseEntity<Role> updateRole(@PathVariable("id") long id ,@RequestBody Role role){
		return new ResponseEntity<Role>(roleService.updateRole(role, id), HttpStatus.OK);
	}
	
	// build delete role REST API
	// http://localhost:8080/api/roles/1
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteRole(@PathVariable("id") long id){
		// delete role from DB
		roleService.deleteRole(id);
		return new ResponseEntity<String>("Role deleted successfully!.", HttpStatus.OK);
	}
}
