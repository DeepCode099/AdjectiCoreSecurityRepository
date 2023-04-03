package com.adjecti.security.core.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "role_")
public class Role {
	private long mvccVersion;
	private long ctCollectionId;
	private String uuid_;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long roleId;
	private long companyId;	
	private String userName;
	private Date createDate;
	private Date modifiedDate;
	private long classNameId;
	private long classpk;
	private String name;
	private String title;
	private String description;
	private int type;
	private String subType;
	private long userId;
	public long getMvccVersion() {
		return mvccVersion;
	}
	public void setMvccVersion(long mvccVersion) {
		this.mvccVersion = mvccVersion;
	}
	public long getCtCollectionId() {
		return ctCollectionId;
	}
	public void setCtCollectionId(long ctCollectionId) {
		this.ctCollectionId = ctCollectionId;
	}
	public String getUuid_() {
		return uuid_;
	}
	public void setUuid_(String uuid_) {
		this.uuid_ = uuid_;
	}
	public long getRoleId() {
		return roleId;
	}
	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}
	public long getCompanyId() {
		return companyId;
	}
	public void setCompanyId(long companyId) {
		this.companyId = companyId;
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
	public long getClassNameId() {
		return classNameId;
	}
	public void setClassNameId(long classNameId) {
		this.classNameId = classNameId;
	}
	public long getClasspk() {
		return classpk;
	}
	public void setClasspk(long classpk) {
		this.classpk = classpk;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getSubType() {
		return subType;
	}
	public void setSubType(String subType) {
		this.subType = subType;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public Role(long mvccVersion, long ctCollectionId, String uuid_, long roleId, long companyId, String userName,
			Date createDate, Date modifiedDate, long classNameId, long classpk, String name, String title,
			String description, int type, String subType, long userId) {
		super();
		this.mvccVersion = mvccVersion;
		this.ctCollectionId = ctCollectionId;
		this.uuid_ = uuid_;
		this.roleId = roleId;
		this.companyId = companyId;
		this.userName = userName;
		this.createDate = createDate;
		this.modifiedDate = modifiedDate;
		this.classNameId = classNameId;
		this.classpk = classpk;
		this.name = name;
		this.title = title;
		this.description = description;
		this.type = type;
		this.subType = subType;
		this.userId = userId;
	}
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
