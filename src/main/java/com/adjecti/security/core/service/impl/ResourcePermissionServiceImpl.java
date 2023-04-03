package com.adjecti.security.core.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.adjecti.security.core.exception.ResourceNotFoundException;
import com.adjecti.security.core.model.ResourcePermission;
import com.adjecti.security.core.repository.ResourcePermissionRepository;
import com.adjecti.security.core.service.ResourcePermissionService;

@Service
public class ResourcePermissionServiceImpl implements ResourcePermissionService {

	private ResourcePermissionRepository resourcePermissionRepository;
	
	
	public ResourcePermissionServiceImpl(ResourcePermissionRepository ResourcePermissionRepository) {
		super();
		this.resourcePermissionRepository = ResourcePermissionRepository;
	}

	@Override
	public ResourcePermission createResourcePermission(ResourcePermission resourcePermission) {
		return resourcePermissionRepository.save(resourcePermission);
	}
	@Override
	public List<ResourcePermission> getAllResourcePermissions() {
		return resourcePermissionRepository.findAll();
	}
    @Override
	public ResourcePermission getREsourcePermissionById(long resourcePermissionId) {
		return resourcePermissionRepository.findById(resourcePermissionId).orElseThrow(() -> new ResourceNotFoundException("ResourcePermission", "Id", resourcePermissionId));
	}
	@Override
	public void deleteResourcePermission(long resourcePermissionId) {
			// check whether a ResourcePermission exist or not
		resourcePermissionRepository.findById(resourcePermissionId).orElseThrow(() -> new ResourceNotFoundException("ResourcePermission", "Id", resourcePermissionId));
		resourcePermissionRepository.deleteById(resourcePermissionId);
}

	@Override
	public ResourcePermission updateResourcePermission(ResourcePermission resourcePermission,
			long resourcePermissionId) {
		ResourcePermission existingResourcePermission = resourcePermissionRepository.findById(resourcePermissionId)
				.orElseThrow(() -> new ResourceNotFoundException("ResourcePermission", "Id", resourcePermissionId));
		existingResourcePermission.setMvccVersion(resourcePermission.getMvccVersion());
		existingResourcePermission.setCtCollectionId(resourcePermission.getCtCollectionId());
		existingResourcePermission.setCompanyId(resourcePermission.getCompanyId());
		existingResourcePermission.setName(resourcePermission.getName());
		existingResourcePermission.setScope(resourcePermission.getScope());
		existingResourcePermission.setPrimKey(resourcePermission.getPrimKey());
		existingResourcePermission.setPrimKeyId(resourcePermission.getPrimKeyId());
		existingResourcePermission.setRoleId(resourcePermission.getRoleId());
		existingResourcePermission.setOwnerId(resourcePermission.getOwnerId());
		existingResourcePermission.setActionIds(resourcePermission.getActionIds());
		existingResourcePermission.setViewActionId(resourcePermission.getActionIds());
		return resourcePermissionRepository.save(existingResourcePermission);
	}
}
