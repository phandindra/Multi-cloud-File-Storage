package com.cloudstorageapi.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cloudstorageapi.api.model.StorageIdRequest;
import com.cloudstorageapi.api.model.StorageRequestBody;
import  com.cloudstorageapi.api.service.StorageService;
 
  
@RestController
@CrossOrigin
public class StorageController {
	
	@Autowired
	private  StorageService StorageService;	
	
	@RequestMapping(value = "/createStorage", method = RequestMethod.POST)
	public ResponseEntity<?> createStorage(@RequestBody StorageRequestBody StorageReqBody) throws Exception {
		return ResponseEntity.ok(StorageService.createStorage(StorageReqBody));
	}
	
	@RequestMapping(value = "/updateStorage", method = RequestMethod.PUT)
	public ResponseEntity<?> updateStorage(@RequestBody StorageRequestBody StorageReqBody) throws Exception {
		return ResponseEntity.ok(StorageService.updateStorage(StorageReqBody));
	}		
	
	@RequestMapping(value = "/listAllStorages", method = RequestMethod.GET)
	public ResponseEntity<?> listAllStorages(@RequestParam(defaultValue = "0") final Integer pageNumber,
			@RequestParam(defaultValue = "10") final Integer size) throws Exception {
		return ResponseEntity.ok(StorageService.listallusersfromdb(pageNumber, size));
	}		
	
	@RequestMapping(value = "/deleteStorage", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteStorage(@RequestBody StorageIdRequest user) throws Exception {
		return ResponseEntity.ok(StorageService.deleteStorage(user));
	}		
	
	@RequestMapping(value = "/Storagescount", method = RequestMethod.GET)
	public ResponseEntity<?> countNumberOfStorages() throws Exception {
		return ResponseEntity.ok((StorageService.countNumberOfStorages()));
	}
	
}
