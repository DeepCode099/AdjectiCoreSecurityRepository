package com.adjecti.security.core.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "organization")
public class Organization {
 
	@Id
	@Column(name ="organizationid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private long companyId;
	private long userId;
	private String userName;
	private Date createDate;
	private Date modifieDate;
	private long parentOrganizationId;
	private String treePath;
	private String type;
	private long regionId;
	private long countryId;
	private long statusId;
	private String comments;
	private long logoId;
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
	public Date getModifieDate() {
		return modifieDate;
	}
	public void setModifieDate(Date modifieDate) {
		this.modifieDate = modifieDate;
	}
	public long getParentOrganizationId() {
		return parentOrganizationId;
	}
	public void setParentOrganizationId(long parentOrganizationId) {
		this.parentOrganizationId = parentOrganizationId;
	}
	public String getTreePath() {
		return treePath;
	}
	public void setTreePath(String treePath) {
		this.treePath = treePath;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public long getRegionId() {
		return regionId;
	}
	public void setRegionId(long regionId) {
		this.regionId = regionId;
	}
	public long getCountryId() {
		return countryId;
	}
	public void setCountryId(long countryId) {
		this.countryId = countryId;
	}
	public long getStatusId() {
		return statusId;
	}
	public void setStatusId(long statusId) {
		this.statusId = statusId;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public long getLogoId() {
		return logoId;
	}
	public void setLogoId(long logoId) {
		this.logoId = logoId;
	}
	public Organization(long id, long companyId, long userId, String userName, Date createDate, Date modifieDate,
			long parentOrganizationId, String treePath, String type, long regionId, long countryId, long statusId,
			String comments, long logoId) {
		super();
		this.id = id;
		this.companyId = companyId;
		this.userId = userId;
		this.userName = userName;
		this.createDate = createDate;
		this.modifieDate = modifieDate;
		this.parentOrganizationId = parentOrganizationId;
		this.treePath = treePath;
		this.type = type;
		this.regionId = regionId;
		this.countryId = countryId;
		this.statusId = statusId;
		this.comments = comments;
		this.logoId = logoId;
	}
	public Organization() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
