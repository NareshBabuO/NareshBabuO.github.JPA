package com.xworkz.jpa.runner;

import com.xworkz.jpa.entity.MetroEntity;
import com.xworkz.jpa.repository.MetroRepositoryImpl;
import com.xworkz.jpa.service.MetroServiceImpl;

public class MetroRunner {

	public static void main(String[] args) {

		MetroEntity mEntity = new MetroEntity(1, "NammaMetro", "Nagasandra", "ReshmeNagari", true, "Electric",
				"Mejestic", 24, true, 120);
		MetroEntity mEntity1 = new MetroEntity(2, "NamdeMetro", "Baiyappanahalli ", "Mysore Road", true, "Electric",
				"Mejestic", 17, true, 85);

		MetroRepositoryImpl mrepo = new MetroRepositoryImpl();
		MetroServiceImpl serviceImpl = new MetroServiceImpl(mrepo);
		serviceImpl.ValidateAndSave(mEntity);
		serviceImpl.ValidateAndSave(mEntity1);
	}

}
