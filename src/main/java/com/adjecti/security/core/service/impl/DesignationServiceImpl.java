package com.adjecti.security.core.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.adjecti.security.core.model.Designation;
import com.adjecti.security.core.repository.DesignationRepository;
import com.adjecti.security.core.service.DesignationService;

@Service
public class DesignationServiceImpl  implements DesignationService{

   private DesignationRepository designationRepositroy;
	
   public DesignationServiceImpl(DesignationRepository designationRepository) {
		super();
		this.designationRepositroy = designationRepository;
	}

	
	@Override
	public List<Designation> getAllDesignation() {
		return designationRepositroy.findAll();
	}

}
