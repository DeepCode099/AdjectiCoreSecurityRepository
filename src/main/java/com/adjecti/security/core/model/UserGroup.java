package com.adjecti.security.core.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usergroup")
public class UserGroup {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="usergroupid")
	private long id;
	private long companyId;
	private long userId;
	private String userName;
	private Date createDate;
	private Date modifiedDate;
	private long parentUserGroupId;
	private String name;
	private String description;
	private boolean addedByLdapImport;
	private String externalReferenceCode;
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public long getParentUserGroupId() {
		return parentUserGroupId;
	}
	public void setParentUserGroupId(long parentUserGroupId) {
		this.parentUserGroupId = parentUserGroupId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isAddedByLdapImport() {
		return addedByLdapImport;
	}
	public void setAddedByLdapImport(boolean addedByLdapImport) {
		this.addedByLdapImport = addedByLdapImport;
	}
	public String getExternalReferenceCode() {
		return externalReferenceCode;
	}
	public void setExternalReferenceCode(String externalReferenceCode) {
		this.externalReferenceCode = externalReferenceCode;
	}
	public UserGroup(long id, long companyId, long userId, String userName, Date createDate, Date modifiedDate,
			long parentUserGroupId, String name, String description, boolean addedByLdapImport,
			String externalReferenceCode) {
		super();
		this.id = id;
		this.companyId = companyId;
		this.userId = userId;
		this.userName = userName;
		this.createDate = createDate;
		this.modifiedDate = modifiedDate;
		this.parentUserGroupId = parentUserGroupId;
		this.name = name;
		this.description = description;
		this.addedByLdapImport = addedByLdapImport;
		this.externalReferenceCode = externalReferenceCode;
	}
	public UserGroup() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
