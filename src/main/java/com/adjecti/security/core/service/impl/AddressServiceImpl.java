package com.adjecti.security.core.service.impl;

import org.springframework.stereotype.Service;

import com.adjecti.security.core.model.Address;
import com.adjecti.security.core.repository.AddressRepository;
import com.adjecti.security.core.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService {

	private AddressRepository addressRepository;

	public AddressServiceImpl(AddressRepository addressRepository) {
		super();
		this.addressRepository = addressRepository;
	}

	@Override
	public Address createAddress(Address address) {
		return addressRepository.save(address);
	}

}
