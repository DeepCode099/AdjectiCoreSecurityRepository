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

import com.adjecti.security.core.model.Organization;
import com.adjecti.security.core.service.OrganizationService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/organization")
public class OrganizationController {

	private OrganizationService organizationService;

	public OrganizationController(OrganizationService organizationService) {
		super();
		this.organizationService = organizationService;
	}

	// build create Organization REST API
	// http://localhost:8080/api/v1/organization
	@PostMapping()
	public ResponseEntity<Organization> createOrganization(@RequestBody Organization organization) {
		return new ResponseEntity<Organization>(organizationService.createOrganization(organization),
				HttpStatus.CREATED);
	}

	// build get all Organizations REST API
	// http://localhost:8080/api/v1/organization
	@GetMapping
	public List<Organization> getAllOrganizations() {
		return organizationService.getAllOrganizations();
	}

	// build get Organization by id REST API
	// http://localhost:8080/api/v1/organization/1
	@GetMapping("{id}")
	public ResponseEntity<Organization> getOrganizationById(@PathVariable("id") long organizationId) {
		return new ResponseEntity<Organization>(organizationService.getOrganizationById(organizationId), HttpStatus.OK);
	}

	// build update Organization REST API
	// http://localhost:8080/api/v1/organization/1
	@PutMapping("{id}")
	public ResponseEntity<Organization> updateOrganization(@PathVariable("id") long id,
			@RequestBody Organization organization) {
		return new ResponseEntity<Organization>(organizationService.updateOrganization(organization, id),
				HttpStatus.OK);
	}

	// build delete Organization REST API
	// http://localhost:8080/api/organization/1
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteOrganization(@PathVariable("id") long id) {
		// delete Organization from DB
		organizationService.deleteOrganization(id);
		return new ResponseEntity<String>("Organization deleted successfully!.", HttpStatus.OK);
	}

}
