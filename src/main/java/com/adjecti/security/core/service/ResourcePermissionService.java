package com.adjecti.security.core.service;

import java.util.List;

import com.adjecti.security.core.model.ResourcePermission;

public interface ResourcePermissionService {

	   public ResourcePermission createResourcePermission(ResourcePermission resourcePermission);
	   public List<ResourcePermission> getAllResourcePermissions();
	   public ResourcePermission getREsourcePermissionById(long resourcePermissionId);
	   public ResourcePermission updateResourcePermission(ResourcePermission resourcePermission, long resourcePermissionId);
	   public void deleteResourcePermission(long resourcePermissionId);
}
