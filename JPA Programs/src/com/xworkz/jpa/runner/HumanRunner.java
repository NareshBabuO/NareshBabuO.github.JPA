package com.xworkz.jpa.runner;
import java.util.Optional;

import com.xworkz.jpa.entity.HumanEntity;
import com.xworkz.jpa.repository.HumanRepositoryImpl;
import com.xworkz.jpa.service.HumanServiceImpl;

public class HumanRunner {

	public static void main(String[] args) {

		HumanEntity humanEntity = new HumanEntity(1, "Heart", "HomeSepian", 213, "Filtration", 2, "Brian,Eye", 2, 336,
				32, "light Brown", 10, "Teasting", "Male", 2);

		HumanRepositoryImpl repositoryImpl = new HumanRepositoryImpl();
		HumanServiceImpl serviceImpl = new HumanServiceImpl(repositoryImpl);

		serviceImpl.ValidateAndSave(humanEntity);

		System.out.println("=================================================");

		Optional<HumanEntity> findById = serviceImpl.findById(1);
		System.out.println(findById);

		System.out.println("------------------------------");

		serviceImpl.updateByName(1, "HumanBeings");

	}

}
