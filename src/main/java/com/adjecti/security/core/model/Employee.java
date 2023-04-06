package com.adjecti.security.core.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name ="employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="employeeid")
	private long id;
	@Column(name = "employeecode",unique = true)
	private String code;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "designationid")
	private Designation designation;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "addressid")
	private Address address;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "bloodgroupid")
	private BloodGroup bloodGroup;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userid")
	private User user;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Designation getDesignation() {
		return designation;
	}

	public void setDesignation(Designation designation) {
		this.designation = designation;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public BloodGroup getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(BloodGroup bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Employee(long id, String code, Designation designation, Address address, BloodGroup bloodGroup, User user) {
		super();
		this.id = id;
		this.code = code;
		this.designation = designation;
		this.address = address;
		this.bloodGroup = bloodGroup;
		this.user = user;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
