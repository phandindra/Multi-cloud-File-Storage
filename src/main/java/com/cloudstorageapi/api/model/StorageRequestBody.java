package com.cloudstorageapi.api.model;

import java.util.Date;

public class StorageRequestBody {
 
	private int StorageId;

	 
	private String StorageName;
	 
	private int parentStorageId;
	  
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
