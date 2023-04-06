package com.adjecti.security.core.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adjecti.security.core.model.BloodGroup;
import com.adjecti.security.core.service.BloodGroupService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/bloodGroup")
public class BloodGroupController {

    private BloodGroupService bloodGroupService;
	
	public BloodGroupController(BloodGroupService bloodGroupService) {
		super();
		this.bloodGroupService = bloodGroupService;
	}
	@GetMapping
	public List<BloodGroup> getAllBloodGroup(){
		return bloodGroupService.getAllBloodGroup();
	}

}
