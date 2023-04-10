
package com.adjecti.security.core.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "state")
public class State {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "stateid")
	private long id;
	@Column(name ="statename")
	private String name;
	@Column(name ="statecode")
	private String code;
    @Column(name ="countryid")
	private long countryid;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public long getCountryid() {
		return countryid;
	}
	public void setCountryid(long countryid) {
		this.countryid = countryid;
	}
	public State(long id, String name, String code, long countryid) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
		this.countryid = countryid;
	}
	public State() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
