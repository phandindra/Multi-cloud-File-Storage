package com.cloudstorageapi.api.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.cloudstorageapi.api.entity.StorageEntity;
 
 
@Repository
public interface  StorageRepository extends CrudRepository<StorageEntity,Integer> {

	@Query(value = "select * from  hemavathy_Storages ", nativeQuery = true)
	Page<StorageEntity> listallusersfromdb(Pageable pageable);

	@Query(value = "SELECT count(*) from hemavathy_Storages", nativeQuery = true)
	String countNumberOfStorages();



}
