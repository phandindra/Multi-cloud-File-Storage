package com.cloudstorageapi.api.entity;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "pragadees_folders")
public class StorageEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Storage_id", nullable = false)
	private int StorageId;
    
	@Column(name = "Storage_name", nullable = false)
	private String StorageName;
	@Column(name = "parent_Storage_id", nullable = false)
	private int parentStorageId;
	 
	@Column(name = "created_at", nullable = false)
	private Date createdAt;

	public int getStorageId() {
		return StorageId;
	}

	public void setStorageId(int StorageId) {
		this.StorageId = StorageId;
	}

	public String getStorageName() {
		return StorageName;
	}

	public void setStorageName(String StorageName) {
		this.StorageName = StorageName;
	}

	public int getParentStorageId() {
		return parentStorageId;
	}

	public void setParentStorageId(int parentStorageId) {
		this.parentStorageId = parentStorageId;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
 
 

}
