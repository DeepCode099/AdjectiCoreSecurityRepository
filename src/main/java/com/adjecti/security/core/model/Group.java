package com.adjecti.security.core.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="group_")
public class Group {

	@Id
	@Column(name = "groupid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private long companyId;
	private long creatorUserId;
	private Date modifiedDate;
    private long classNameId;
    private long classPk;
    private long parentGroupId;
    private long livegroupId;
    private String treePath;
    private String groupKey;
    private String name;
    private String description;
    private int type;
    private String typeSettings;
    private boolean manualMembership;
    private int memebershipPrestriction;
    private String friendlyUrl;
    private boolean site;
    private boolean inheritContent;
    private boolean active;
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
	public long getCreatorUserId() {
		return creatorUserId;
	}
	public void setCreatorUserId(long creatorUserId) {
		this.creatorUserId = creatorUserId;
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
	public long getClassPk() {
		return classPk;
	}
	public void setClassPk(long classPk) {
		this.classPk = classPk;
	}
	public long getParentGroupId() {
		return parentGroupId;
	}
	public void setParentGroupId(long parentGroupId) {
		this.parentGroupId = parentGroupId;
	}
	public long getLivegroupId() {
		return livegroupId;
	}
	public void setLivegroupId(long livegroupId) {
		this.livegroupId = livegroupId;
	}
	public String getTreePath() {
		return treePath;
	}
	public void setTreePath(String treePath) {
		this.treePath = treePath;
	}
	public String getGroupKey() {
		return groupKey;
	}
	public void setGroupKey(String groupKey) {
		this.groupKey = groupKey;
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
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getTypeSettings() {
		return typeSettings;
	}
	public void setTypeSettings(String typeSettings) {
		this.typeSettings = typeSettings;
	}
	public boolean isManualMembership() {
		return manualMembership;
	}
	public void setManualMembership(boolean manualMembership) {
		this.manualMembership = manualMembership;
	}
	public int getMemebershipPrestriction() {
		return memebershipPrestriction;
	}
	public void setMemebershipPrestriction(int memebershipPrestriction) {
		this.memebershipPrestriction = memebershipPrestriction;
	}
	public String getFriendlyUrl() {
		return friendlyUrl;
	}
	public void setFriendlyUrl(String friendlyUrl) {
		this.friendlyUrl = friendlyUrl;
	}
	public boolean isSite() {
		return site;
	}
	public void setSite(boolean site) {
		this.site = site;
	}
	public boolean isInheritContent() {
		return inheritContent;
	}
	public void setInheritContent(boolean inheritContent) {
		this.inheritContent = inheritContent;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public Group(long id, long companyId, long creatorUserId, Date modifiedDate, long classNameId, long classPk,
			long parentGroupId, long livegroupId, String treePath, String groupKey, String name, String description,
			int type, String typeSettings, boolean manualMembership, int memebershipPrestriction, String friendlyUrl,
			boolean site, boolean inheritContent, boolean active) {
		super();
		this.id = id;
		this.companyId = companyId;
		this.creatorUserId = creatorUserId;
		this.modifiedDate = modifiedDate;
		this.classNameId = classNameId;
		this.classPk = classPk;
		this.parentGroupId = parentGroupId;
		this.livegroupId = livegroupId;
		this.treePath = treePath;
		this.groupKey = groupKey;
		this.name = name;
		this.description = description;
		this.type = type;
		this.typeSettings = typeSettings;
		this.manualMembership = manualMembership;
		this.memebershipPrestriction = memebershipPrestriction;
		this.friendlyUrl = friendlyUrl;
		this.site = site;
		this.inheritContent = inheritContent;
		this.active = active;
	}
	public Group() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}
