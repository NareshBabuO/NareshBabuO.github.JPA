package com.xworkz.jpa.runner;

import java.util.Optional;

import com.xworkz.jpa.entity.StadiumEntity;
import com.xworkz.jpa.repository.StadiumRepositoryImpl;
import com.xworkz.jpa.service.StadiumServiceImpl;

public class StadiumRunner {

	public static void main(String[] args) {

		StadiumEntity stadiumEntity = new StadiumEntity(1, "Narendra Modi Stadium", 1983, 132000, 2000, "Criket");
		StadiumEntity stadiumEntity1 = new StadiumEntity(2, "Eden Gardens", 1864, 66000, 1200, "Criket");
		StadiumEntity stadiumEntity2 = new StadiumEntity(3, "Jawaharlal Nehru Stadium", 2010, 65000, 2200, "Criket");
		StadiumEntity stadiumEntity3 = new StadiumEntity(4, "M. Chinnaswamy Stadium", 1969, 40000, 2500, "Criket");

		StadiumRepositoryImpl stadiumRepository = new StadiumRepositoryImpl();
		StadiumServiceImpl stadiumService = new StadiumServiceImpl(stadiumRepository);
		stadiumService.ValidateAndSave(stadiumEntity);
		stadiumService.ValidateAndSave(stadiumEntity1);
		stadiumService.ValidateAndSave(stadiumEntity2);
		stadiumService.ValidateAndSave(stadiumEntity3);

		System.out.println("------------------------");

		Optional<StadiumEntity> byId = stadiumService.findById(3);
		System.out.println(byId);

		System.out.println("=========================");
		Optional<StadiumEntity> updateByName = stadiumService.updateByName(2, "M.A.Chidambaram");
		System.out.println(updateByName);
		
		System.out.println("+++++++++++++++++++++");
		
		 stadiumService.deleteById(3);

	}

}
