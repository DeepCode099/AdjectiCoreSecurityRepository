package com.adjecti.security.core.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adjecti.security.core.model.Country;
import com.adjecti.security.core.service.CountryService;

@RestController
@RequestMapping("/api/v1/country")
public class CountryController {

	private CountryService countryService;
	
	public CountryController(CountryService countryService) {
		super();
		this.countryService = countryService;
	}
	
	@GetMapping
	public List<Country> getAllCountryList(){
		return countryService.getAllCountryList();
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Country> getCountryById(@PathVariable("id") long countryId){
		return new ResponseEntity<Country>(countryService.getCountryById(countryId), HttpStatus.OK);
	}
	
}
