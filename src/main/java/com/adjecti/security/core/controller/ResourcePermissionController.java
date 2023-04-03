package com.adjecti.security.core.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adjecti.security.core.model.ResourcePermission;
import com.adjecti.security.core.model.Role;
import com.adjecti.security.core.service.ResourcePermissionService;
import com.adjecti.security.core.service.RoleService;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@RestController
@RequestMapping("/api/v1/resourcePermission")
public class ResourcePermissionController {
	
private ResourcePermissionService resourcePermissionService;
	
	public ResourcePermissionController(ResourcePermissionService resourcePermissionService) {
		super();
		this.resourcePermissionService = resourcePermissionService;
	}
	
	// build create ResourcePermissionService REST API
//	http://localhost:8080/api/v1/resourcePermission
	@PostMapping()
	public ResponseEntity<ResourcePermission> createResourcePermission(@RequestBody ResourcePermission resourcePermission){
		return new ResponseEntity<ResourcePermission>(resourcePermissionService.createResourcePermission(resourcePermission), HttpStatus.CREATED);
	}
	
	// build get all roles REST API
	// http://localhost:8080/api/v1/resourcePermission
	@GetMapping
	public List<ResourcePermission> getAllResourcePermissions(){
		return resourcePermissionService.getAllResourcePermissions();
	}
	
	// build get role by id REST API
	// http://localhost:8080/api/v1/resourcePermission/1
	@GetMapping("{id}")
	public ResponseEntity<ResourcePermission> getResourcePermissionById(@PathVariable("id") long resourcePermissionId){
		return new ResponseEntity<ResourcePermission>(resourcePermissionService.getREsourcePermissionById(resourcePermissionId), HttpStatus.OK);
	}
	
	// build update role REST API
	// http://localhost:8080/api/v1/resourcePermission/1
	@PutMapping("{id}")
	public ResponseEntity<ResourcePermission> updateResourcePermission(@PathVariable("id") long resourcePermissionId ,@RequestBody ResourcePermission resourcePermission){
		return new ResponseEntity<ResourcePermission>(resourcePermissionService.updateResourcePermission(resourcePermission, resourcePermissionId), HttpStatus.OK);
	}
	
	// build delete role REST API
	// http://localhost:8080/api/v1/resourcePermission/1
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteResourcePermission(@PathVariable("id") long id){
		// delete role from DB
		resourcePermissionService.deleteResourcePermission(id);
		return new ResponseEntity<String>("ResourcePermission deleted successfully!.", HttpStatus.OK);
	}
}
