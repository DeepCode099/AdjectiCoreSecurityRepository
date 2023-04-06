package com.adjecti.security.core.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="users_orgs")
public class UsersOrganization {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "usersorganizationid")
	private long id;
    private long companyId;
	private long userId;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getCompanyId() {
		return companyId;
	}
	public void setCompanyId(long companyId) {
		this.companyId = companyId;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public UsersOrganization(long id, long companyId, long userId) {
		super();
		this.id = id;
		this.companyId = companyId;
		this.userId = userId;
	}
	public UsersOrganization() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
