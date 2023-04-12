package com.adjecti.security.core.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adjecti.security.core.model.Designation;
import com.adjecti.security.core.model.Role;
import com.adjecti.security.core.service.DesignationService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/designation")
public class DesignationController {

private DesignationService designationService;
	
	public DesignationController(DesignationService designationService) {
		super();
		this.designationService = designationService;
	}
	
	// build get all user REST API
		@GetMapping
		public List<Designation> getAllDesignation(){
			return designationService.getAllDesignation();
		}
	
	// build create designation REST API	
	
		@PostMapping()
		public ResponseEntity<Designation> createDesignation(@RequestBody Designation designation){
			return new ResponseEntity<Designation>(designationService.createDesignation(designation),HttpStatus.CREATED);
		}
		
		
		
		
}
