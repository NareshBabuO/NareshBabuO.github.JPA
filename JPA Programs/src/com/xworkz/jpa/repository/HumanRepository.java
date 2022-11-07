package com.xworkz.jpa.repository;

import java.util.Optional;

import com.xworkz.jpa.entity.HumanEntity;

public interface HumanRepository {

	boolean Save(HumanEntity entity);

	Optional<HumanEntity> findById(int id);

	void updateByname(int id, String name);

}
