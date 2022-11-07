package com.xworkz.jpa.service;

import java.util.Optional;

import com.xworkz.jpa.entity.HumanEntity;

public interface HumanService {
	
	boolean ValidateAndSave(HumanEntity entity);
	
	Optional<HumanEntity> findById(int id);
	
	void updateByName(int id, String name);
	
	

}
