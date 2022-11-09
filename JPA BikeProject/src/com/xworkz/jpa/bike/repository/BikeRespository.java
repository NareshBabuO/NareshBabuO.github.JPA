package com.xworkz.jpa.bike.repository;

import java.util.List;
import java.util.Optional;

import com.xworkz.jpa.bike.entity.BikeEntity;

public interface BikeRespository {

	boolean Save(BikeEntity entity);

	boolean Save(List<BikeEntity> list);

	Optional<BikeEntity> findById(int id);

	void updateByBrandbyId(int id, String name);

	void deleteById(int id);

}
