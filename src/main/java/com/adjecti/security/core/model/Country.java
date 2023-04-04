package com.adjecti.security.core.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "country")
public class Country {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long countryId;
	private String countryCode;
	private String countryValue;
	
	public long getCountryId() {
		return countryId;
	}
	public void setCountryId(long countryId) {
		this.countryId = countryId;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getCountryValue() {
		return countryValue;
	}
	public void setCountryValue(String countryValue) {
		this.countryValue = countryValue;
	}
	
	public Country(long countryId, String countryCode, String countryValue) {
		super();
		this.countryId = countryId;
		this.countryCode = countryCode;
		this.countryValue = countryValue;

	}
	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
