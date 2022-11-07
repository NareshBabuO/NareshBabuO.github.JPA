package com.xworkz.jpa.service;

import java.util.Optional;

import com.xworkz.jpa.entity.StadiumEntity;

public interface StadiumService {

	boolean ValidateAndSave(StadiumEntity entity);

	Optional<StadiumEntity> findById(int id);
	
	Optional<StadiumEntity> updateByName(int id,String name);
	
	void deleteById(int id);

}
