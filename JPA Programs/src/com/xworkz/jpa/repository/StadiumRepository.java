package com.xworkz.jpa.repository;

import java.util.Optional;

import com.xworkz.jpa.entity.StadiumEntity;

public interface StadiumRepository {

	boolean Save(StadiumEntity entity);

	Optional<StadiumEntity> findByid(int id);

	Optional<StadiumEntity> updateByName(int id, String name);

	void deleteById(int id);

}
