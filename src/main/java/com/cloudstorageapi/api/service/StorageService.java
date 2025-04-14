package com.cloudstorageapi.api.service;

 
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import org.springframework.stereotype.Service;

import com.cloudstorageapi.api.entity.StorageEntity;
import com.cloudstorageapi.api.model.StorageIdRequest;
import com.cloudstorageapi.api.model.StorageRequestBody;
import com.cloudstorageapi.api.repositories.StorageRepository;

@Service
public class StorageService  {

	@Autowired
	private  StorageRepository StorageRepository;

	

	public StorageEntity createStorage(StorageRequestBody StorageRequestBodyObj) {

		StorageEntity newStorage = new StorageEntity();
		newStorage.setStorageName(StorageRequestBodyObj.getStorageName());
		newStorage.setStorageId(StorageRequestBodyObj.getParentStorageId());
		newStorage.setCreatedAt(StorageRequestBodyObj.getCreatedAt());
	 
		return StorageRepository.save(newStorage);		 
	}

	public StorageEntity updateStorage(StorageRequestBody StorageRequestBodyObj) {
		StorageEntity newStorage = new StorageEntity();
		newStorage.setStorageId(StorageRequestBodyObj.getStorageId() );
		newStorage.setStorageName(StorageRequestBodyObj.getStorageName());
		newStorage.setStorageId(StorageRequestBodyObj.getParentStorageId());
		newStorage.setCreatedAt(StorageRequestBodyObj.getCreatedAt());
		return StorageRepository.save(newStorage);		 
	}

	public Page<StorageEntity> listallusersfromdb(int pageNumber, int size) {
		Pageable pageable = PageRequest.of(pageNumber, size);
		return StorageRepository.listallusersfromdb(pageable);
	}
 
	public String deleteStorage(StorageIdRequest fld) {
		int StorageId= fld.getStorageId();
		StorageRepository.deleteById(StorageId);
		return "Storage Deleted";
	}

	public String countNumberOfStorages() {

		return StorageRepository.countNumberOfStorages();
	}

}
