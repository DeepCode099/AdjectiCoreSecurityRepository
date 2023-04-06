package com.adjecti.security.core.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="bloodgroup")
public class BloodGroup {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "bloodgroupid")
	private long id;
	@Column(name = "bloodgroupname")
	private String name;
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
	public BloodGroup(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public BloodGroup() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
