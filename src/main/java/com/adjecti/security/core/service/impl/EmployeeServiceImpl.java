package com.adjecti.security.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adjecti.security.core.model.Address;
import com.adjecti.security.core.model.BloodGroup;
import com.adjecti.security.core.model.Designation;
import com.adjecti.security.core.model.Employee;
import com.adjecti.security.core.model.User;
import com.adjecti.security.core.repository.AddressRepository;
import com.adjecti.security.core.repository.BloodGroupRepository;
import com.adjecti.security.core.repository.DesignationRepository;
import com.adjecti.security.core.repository.EmployeeRepository;
import com.adjecti.security.core.repository.UserRepository;
import com.adjecti.security.core.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private DesignationRepository  designationRepositroy;
	@Autowired
	private AddressRepository addressRepository;
	@Autowired
	private BloodGroupRepository bloodGroupRepository;
    @Autowired
    private UserRepository userRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}
	
	@Override
	public Employee createEmployee(Employee employee) {
		
		
		System.out.println("designation--->"+employee.getDesignation().toString());
		
		    Designation designation = employee.getDesignation();
	        Address address = employee.getAddress();
	        BloodGroup bloodGroup = employee.getBloodGroup();
	        User user = employee.getUser();
	        designation = designationRepositroy.save(designation);
	        address = addressRepository.save(address);
	        bloodGroup = bloodGroupRepository.save(bloodGroup);
	        user = userRepository.save(user);
	        employee.setDesignation(designation);
	        employee.setAddress(address);
	        employee.setBloodGroup(bloodGroup);
	        employee.setUser(user);
		    return employeeRepository.save(employee);
	}

	
	
	
}
