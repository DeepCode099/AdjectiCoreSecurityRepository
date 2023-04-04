package com.adjecti.security.core.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "state")
public class State {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long stateId;
	private long countryId;
	private String stateName;
	private String stateCode;
	public long getStateId() {
		return stateId;
	}
	public void setStateId(long stateId) {
		this.stateId = stateId;
	}
	public long getCountryId() {
		return countryId;
	}
	public void setCountryId(long countryId) {
		this.countryId = countryId;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	public State(long stateId, long countryId, String stateName, String stateCode) {
		super();
		this.stateId = stateId;
		this.countryId = countryId;
		this.stateName = stateName;
		this.stateCode = stateCode;
	}
	public State() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "State [stateId=" + stateId + ", countryId=" + countryId + ", stateName=" + stateName + ", stateCode="
				+ stateCode + "]";
	}
	
	
	
}
