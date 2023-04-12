package com.adjecti.security.core.service;

import java.util.List;

import com.adjecti.security.core.model.Address;
import com.adjecti.security.core.model.BloodGroup;

public interface BloodGroupService {
	
      public List<BloodGroup> getAllBloodGroup();
	
   // method for create BloodGroup 
  	public BloodGroup createBloodGroup(BloodGroup bloodGroup);

}
