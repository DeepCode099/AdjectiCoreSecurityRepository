package com.adjecti.security.core.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="designation")
public class Designation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="designationid")
	private long id;
	@Column(name = "designationname")
	private String name;
	@Column(name = "designationcode")
	private String code;
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
	public Designation(long id, String name, String code) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
	}
	public Designation() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Designation [id=" + id + ", name=" + name + ", code=" + code + "]";
	}

}
