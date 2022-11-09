package com.xworkz.jpa.bike.service;

import java.util.List;
import java.util.Optional;

import com.xworkz.jpa.bike.entity.BikeEntity;

public interface BikeService {
	
	boolean ValidateAndSave(BikeEntity entity);
	
	boolean ValidateAndSave(List<BikeEntity> list);
	
	Optional<BikeEntity> findById(int id);
	
	void updateByBrandById(int id, String name);
	
	void deleteById(int id);
	
	

}
