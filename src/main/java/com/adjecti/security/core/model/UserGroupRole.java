package com.adjecti.security.core.model;

import jakarta.persistence.Column;
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
	@Column(name ="usergroupid")
	private long id;
	private long companyId;
	private long userId;
	private long groupId;
	private long roleId;
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
	public UserGroupRole() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserGroupRole(long id, long companyId, long userId, long groupId, long roleId) {
		super();
		this.id = id;
		this.companyId = companyId;
		this.userId = userId;
		this.groupId = groupId;
		this.roleId = roleId;
	}
	
	
	
}
