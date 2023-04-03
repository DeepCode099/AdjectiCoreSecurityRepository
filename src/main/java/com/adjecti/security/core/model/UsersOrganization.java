package com.adjecti.security.core.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="users_orgs")
public class UsersOrganization {

	private long companyId;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long organizationId;
	
	private long userId;
	private long ctCollectionId;
	private boolean ctChangeType;
	public long getCompanyId() {
		return companyId;
	}
	public void setCompanyId(long companyId) {
		this.companyId = companyId;
	}
	public long getOrganizationId() {
		return organizationId;
	}
	public void setOrganizationId(long organizationId) {
		this.organizationId = organizationId;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public long getCtCollectionId() {
		return ctCollectionId;
	}
	public void setCtCollectionId(long ctCollectionId) {
		this.ctCollectionId = ctCollectionId;
	}
	public boolean isCtChangeType() {
		return ctChangeType;
	}
	public void setCtChangeType(boolean ctChangeType) {
		this.ctChangeType = ctChangeType;
	}
	public UsersOrganization(long companyId, long organizationId, long userId, long ctCollectionId,
			boolean ctChangeType) {
		super();
		this.companyId = companyId;
		this.organizationId = organizationId;
		this.userId = userId;
		this.ctCollectionId = ctCollectionId;
		this.ctChangeType = ctChangeType;
	}
	public UsersOrganization() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
