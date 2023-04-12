package com.adjecti.security.core.service;

import java.util.List;

import com.adjecti.security.core.model.BloodGroup;
import com.adjecti.security.core.model.Designation;

public interface DesignationService {
	
	// method for get all designation 
	
	public List<Designation> getAllDesignation();
	
	  // method for create Designation 
  	public Designation createDesignation(Designation designation);


}
