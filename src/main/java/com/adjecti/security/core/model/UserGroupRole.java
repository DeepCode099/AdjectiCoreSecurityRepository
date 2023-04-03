package com.adjecti.security.core.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="usergrouprole")
public class UserGroupRole {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private long userGroupRoleId;
	
	private long mvccVersion;
	private long ctCollectionId;
	private long companyId;
	private long userId;
	private long groupId;
	private long roleId;
	public long getUserGroupRoleId() {
		return userGroupRoleId;
	}
	public void setUserGroupRoleId(long userGroupRoleId) {
		this.userGroupRoleId = userGroupRoleId;
	}
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
	public long getGroupId() {
		return groupId;
	}
	public void setGroupId(long groupId) {
		this.groupId = groupId;
	}
	public long getRoleId() {
		return roleId;
	}
	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}
	public UserGroupRole(long userGroupRoleId, long mvccVersion, long ctCollectionId, long companyId, long userId,
			long groupId, long roleId) {
		super();
		this.userGroupRoleId = userGroupRoleId;
		this.mvccVersion = mvccVersion;
		this.ctCollectionId = ctCollectionId;
		this.companyId = companyId;
		this.userId = userId;
		this.groupId = groupId;
		this.roleId = roleId;
	}
	public UserGroupRole() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
