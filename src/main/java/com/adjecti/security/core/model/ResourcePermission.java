package com.adjecti.security.core.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="resourcepermission")
public class ResourcePermission {
	private long mvccVersion;
	private long ctCollectionId;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long resourcePermissionId;
	private long companyId;
	private String name;
	private int scope;
	private String primKey;
	private long primKeyId;
	private long roleId;
	private long ownerId;
	private long actionIds;
	private long viewActionId;
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
	public long getResourcePermissionId() {
		return resourcePermissionId;
	}
	public void setResourcePermissionId(long resourcePermissionId) {
		this.resourcePermissionId = resourcePermissionId;
	}
	public long getCompanyId() {
		return companyId;
	}
	public void setCompanyId(long companyId) {
		this.companyId = companyId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScope() {
		return scope;
	}
	public void setScope(int scope) {
		this.scope = scope;
	}
	public String getPrimKey() {
		return primKey;
	}
	public void setPrimKey(String primKey) {
		this.primKey = primKey;
	}
	public long getPrimKeyId() {
		return primKeyId;
	}
	public void setPrimKeyId(long primKeyId) {
		this.primKeyId = primKeyId;
	}
	public long getRoleId() {
		return roleId;
	}
	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}
	public long getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(long ownerId) {
		this.ownerId = ownerId;
	}
	public long getActionIds() {
		return actionIds;
	}
	public void setActionIds(long actionIds) {
		this.actionIds = actionIds;
	}
	public long getViewActionId() {
		return viewActionId;
	}
	public void setViewActionId(long viewActionId) {
		this.viewActionId = viewActionId;
	}
	public ResourcePermission(long mvccVersion, long ctCollectionId, long resourcePermissionId, long companyId,
			String name, int scope, String primKey, long primKeyId, long roleId, long ownerId, long actionIds,
			long viewActionId) {
		super();
		this.mvccVersion = mvccVersion;
		this.ctCollectionId = ctCollectionId;
		this.resourcePermissionId = resourcePermissionId;
		this.companyId = companyId;
		this.name = name;
		this.scope = scope;
		this.primKey = primKey;
		this.primKeyId = primKeyId;
		this.roleId = roleId;
		this.ownerId = ownerId;
		this.actionIds = actionIds;
		this.viewActionId = viewActionId;
	}
	public ResourcePermission() {
		super();
		// TODO Auto-generated constructor stub
	}
}

