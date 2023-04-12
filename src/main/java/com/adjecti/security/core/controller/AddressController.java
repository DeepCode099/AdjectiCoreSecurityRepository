package com.adjecti.security.core.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adjecti.security.core.model.Address;
import com.adjecti.security.core.service.AddressService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/address")
public class AddressController {
	
private AddressService addressService;
	
	public AddressController(AddressService addressService) {
		super();
		this.addressService = addressService;
	}
	@PostMapping
	public ResponseEntity<Address> createAddress(@RequestBody Address address){
		return new ResponseEntity<Address>(addressService.createAddress(address), HttpStatus.CREATED);
	}
	

}
