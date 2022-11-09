package com.xworkz.jpa.bike.service;

import java.util.List;
import java.util.Optional;

import com.xworkz.jpa.bike.entity.BikeEntity;
import com.xworkz.jpa.bike.repository.BikeRespositoryImpl;

public class BikeServiceImpl implements BikeService {

	private BikeRespositoryImpl repo;

	public BikeServiceImpl(BikeRespositoryImpl repo) {
		this.repo = repo;
	}

	@Override
	public boolean ValidateAndSave(BikeEntity entity) {
		int id = entity.getId();
		String brand = entity.getBrand();
		int year = entity.getYear();
		String color = entity.getColor();
		String bsystem = entity.getBreaksystem();

		if (id > 0 && id < 100) {
			System.out.println("Bike Id is Valid");
		} else {
			System.err.println("Bike Id is Invalid");
		}
		if (brand != null && brand.length() > 0 && brand.length() < 1000) {
			System.out.println("Bike Brand is Valid");
		} else {
			System.err.println("Bike Brand is Invalid");
		}
		if (year > 1980 && year < 2030) {
			System.out.println("Bike Year is Valid");
		} else {
			System.err.println("Bike year is Invalid");
		}
		if (color != null && color.length() > 0 && color.length() < 2000) {
			System.out.println("Bike Color is Valid");
		} else {
			System.err.println("Bike Color is Invalid");
		}
		if (bsystem != null && bsystem.length() > 0 && bsystem.length() < 500) {
			System.out.println("Bike Break System is Valid");
		} else {

			System.err.println("bike Bsystem is Invalid");
		}
		this.repo.Save(entity);

		return true;
	}

	@Override
	public boolean ValidateAndSave(List<BikeEntity> list) {
		BikeEntity entity = new BikeEntity();

		int id = entity.getId();
		String brand = entity.getBrand();
		int year = entity.getYear();
		String color = entity.getColor();
		String bsystem = entity.getBreaksystem();

		if (id > 0) {
			System.out.println("Bike Id is Valid");
		} else {
			System.err.println("Bike Id is Invalid");
		}
		if (brand != null && brand.length() > 0) {
			System.out.println("Bike Brand is Valid");
		} else {
			System.err.println("Bike Brand is Invalid");
		}
		if (year > 1980) {
			System.out.println("Bike Year is Valid");
		} else {
			System.err.println("Bike year is Invalid");
		}
		if (color != null && color.length() > 0) {
			System.out.println("Bike Color is Valid");
		} else {
			System.err.println("Bike Color is Invalid");
		}
		if (bsystem != null && bsystem.length() > 0) {
			System.out.println("Bike Break System is Valid");
		} else {

			System.err.println("bike Bsystem is Invalid");
		}

		this.repo.Save(list);
		return false;
	}

	@Override
	public Optional<BikeEntity> findById(int id) {
		if (id > 0) {
			System.out.println("Bike ID Found");
			return this.repo.findById(id);
		}

		return Optional.empty();
	}

	@Override
	public void updateByBrandById(int id, String name) {
		System.out.println("Bike Brand Updated");
		this.repo.updateByBrandbyId(id, name);
	}

	@Override
	public void deleteById(int id) {
		this.repo.deleteById(id);
	}

}
